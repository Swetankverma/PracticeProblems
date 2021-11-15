import java.util.Scanner;

public class FactorialFun {
    public static void printFactorial(int n){
       if (n<0){
           System.out.println("Invalid Number");
       return;
       }
        int factorial=1;
        for(int i=1;i<=n;i++){
            factorial = factorial *i;
        }
        System.out.println(factorial);
    return;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number you want to print the factoial:");
        int n =sc.nextInt();
        System.out.print("The factorial of given number is:");
     printFactorial(n);

    }
}
