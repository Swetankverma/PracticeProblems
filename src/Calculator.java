
import java.util.Scanner;

public class Calculator  {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Mathematical Operations:");
        int a=sc.nextInt();
        System.out.print("Add=1,Sub=2,Multi=3,divide=4,remainder=5::");
        int n=sc.nextInt();
        int b=sc.nextInt();

        switch (n)
        {
            case 1:
                System.out.println(a+b);
                break;
            case 2:
                System.out.println(a-b);
                break;
            case 3:
                System.out.println(a*b);
                break;
            case 4:
                System.out.println(a/b);
                break;
            case 5:
                System.out.println(a%b);
        }
    }
}
