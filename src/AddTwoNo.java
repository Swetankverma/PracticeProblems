import java.util.Scanner;

public class AddTwoNo {
    public static void main(String[] args) {
        System.out.println("Add Two Numbers");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Number:");
        int a= sc.nextInt();
        System.out.print("Enter 2nd Number:");
        int b= sc.nextInt();
        int sum=a + b;
        System.out.print("The sum of two number be:");
        System.out.print(sum);
    }
}
