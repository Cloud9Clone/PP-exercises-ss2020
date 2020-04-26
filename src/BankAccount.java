
public class BankAccount {

    private int balance; // unit: EUR
    private int overdraft = 500; // Dispokredit 500 EUR
    private boolean overdraftUsed = false;

    public BankAccount() {
        balance = 0;
    }
    public BankAccount(int i) {
        balance = i;
    }

    private void addToBalance(int i) {
        balance += i;
    }

    private void subFromBalance(int i) {
        balance -= i;
    }

    public int getBalance() {
            return balance;
    }

    public int getOverdraft(){
        return overdraft;
    }

    @Bank(action = "Financial Plan")
    public void printFinancialPlan(){
        System.out.println("Overdraft: "+overdraft);
        System.out.println("Balance: "+balance);
        System.out.println("");
    }

    @Bank(action = "Deposit Money")
    public void deposit(int i) {
        addToBalance(i);
        printFinancialPlan();
    }

    @Bank(action = "Withdraw Money")
    public void withdraw(int i) {
        if(i > balance && overdraftUsed == true){
            System.out.println("Operation withdraw("+i+") is not possible since you've used your balance and your overdraft as well!");
            printFinancialPlan();
        } else if(i <= balance && overdraftUsed == true){
            subFromBalance(i);
            printFinancialPlan();
        } else {
            if(i > balance + overdraft && overdraftUsed == false){
                System.out.println("Operation withdraw("+i+") is not possible since your funds can't cover it even with the overdraft!");
                printFinancialPlan();
            } else if(i <= balance && overdraftUsed == false) {
                subFromBalance(i);
                printFinancialPlan();
            } else {
                subFromBalance(i);
                overdraft = overdraft + balance;
                balance=0;
                printFinancialPlan();
                if(overdraft==0) {
                    overdraftUsed = true;
                    System.out.println("Overdraft is completely used");
                    printFinancialPlan();
                }

            }
        }
    }
}
