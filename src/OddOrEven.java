import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
         if (n%2==0)
            System.out.println(n+" Is Even Number");
        else{
        System.out.println(n+ " Is Odd Number");}
    }
}
