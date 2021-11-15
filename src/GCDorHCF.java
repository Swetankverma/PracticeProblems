import java.util.Scanner;

public class GCDorHCF {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Two number:");
       int a=sc.nextInt();
       int b= sc.nextInt();
       int min,n=1;
       min=a<b?a:b;
       for(int i=1;i<=min;i++)
       {
           if(a%i==0 && b%i==0)
               n=i;
           }
       System.out.println("The Hcf of Two Number= " +n);
    }
}
