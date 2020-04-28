import java.util.Scanner;

public class Divide {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter divident:");
        int a = scanner.nextInt();

        System.out.println("Enter divisor:");
        int b = scanner.nextInt();

        try{
            double result= divide(a,b);
            System.out.println(result);

        }catch (DivideByZeroException e){
            System.out.println(e.getMessage());

        }

    }

    public static double divide(int a , int b) throws DivideByZeroException{

        if(b==0){
            throw  new DivideByZeroException("Divisor cannot be zero!");

        }
        return a/b;
    }




}