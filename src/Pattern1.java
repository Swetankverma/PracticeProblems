import java.util.Scanner;
public class Pattern1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the Number your want to draw the pattern::");
        int n=sc.nextInt();
        //outer loop=rows
        for (int i=1;i<=n;i++){
            //inner loop=column
            for(int j=1;j<=n+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }}
