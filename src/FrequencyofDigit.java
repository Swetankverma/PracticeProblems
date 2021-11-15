import java.util.Scanner;

public class FrequencyofDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Digits:");
        int n=sc.nextInt();
        System.out.print("Enter the repeating number:");
        int d=sc.nextInt();
      int count=0;
      while(n!=0){
          int last =n%10;
          n=n/10;
          if(last==d){
              count++;
          }
      }System.out.println(count);
    }
}
