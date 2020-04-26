import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankAccountTesting {

    private static BankAccount ba = new BankAccount();

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("--- Welcome in our Banking Clone! ---");
        System.out.println("");
        System.out.println("Are you a new member? Y/N");
        String newMember = sc.nextLine();
        while(!validInput(newMember)){
            newMember = sc.nextLine();
        }
        if(newMember.equals("N")){
            System.out.println("Please type your balance");
            int balance = sc.nextInt();
            ba = new BankAccount(balance);
        }
        System.out.println("Currently your balance is: ");
        ba.printFinancialPlan();
        while(true) {
            displayOptions();
            System.out.println("Please, select an action");
            int selection = sc.nextInt();
            onSelectedItem(selection);
            System.out.println("Do you want to proceed further with another action? Y/N");
            String input = sc.nextLine();
            while (!validInput(input)) {
                System.out.println("Please, enter a valid input:");
                input = sc.nextLine();
            }
            if(input.equals("N")){
                break;
            }
        }
        System.out.println("--- Goodbye! ---");
    }


    private static void onSelectedItem(int item) {
        Scanner sc = new Scanner(System.in);
        String action = getPossibleActions().get(item).getAnnotation(Bank.class).action();
        switch(action){
            case "Financial Plan":
                ba.printFinancialPlan();
                break;
            case "Deposit Money":
                System.out.println("Please, enter a sum to deposit:");
                int deposit = sc.nextInt();
                ba.deposit(deposit);
                break;
            case "Withdraw Money":
                System.out.println("Please, enter a sum to withdraw:");
                int withdraw = sc.nextInt();
                ba.withdraw(withdraw);
                break;
            default:
                displayOptions();
                System.out.println("Please, select an action");
                int selection = sc.nextInt();
                break;
        }
    }

    private static void displayOptions(){
        for(int i = 0; i< getPossibleActions().size(); i++){
            System.out.println(i + ". " + getPossibleActions().get(i).getAnnotation(Bank.class).action());
        }
    }

    private static List<Method> getPossibleActions(){
        List<Method> meth = new ArrayList<>();
        Class cls = ba.getClass();
        Method[] methods = cls.getDeclaredMethods();
        for(Method m: methods){
            if(m.isAnnotationPresent(Bank.class)){
                meth.add(m);
            }
        }
        return meth;
    }

    private static boolean validInput(String input){
        if(input.length() > 0){
            input.trim();
            if(input.equals("Y") || input.equals("N")){
                return true;
            }
        }
        return false;
    }
}
