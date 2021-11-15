import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number To check Armstrong of Not:");
        int n =sc.nextInt();
        int a = n;
        int d,sum=0;
       while(n!=0){
           d=n%10;
           sum=sum+( d* d* d);
           n=n/10;
       }
       if(sum==a)
           System.out.println(a+ " Is Armstrong Number");
       else
           System.out.println(a+ " Is not Armstrong Number");
        }
    }
