import java.util.Scanner;

public class MultiplyFuctions {
public static int MultipleFun(int x, int y)
{
    int Multiply= x * y;
    return Multiply;
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the 1st Number:");
        int a=sc.nextInt();
        System.out.print("Enter the 2nd Number:");
        int b=sc.nextInt();
        int Mulitply= MultipleFun(a,b);
        System.out.println("Multiple of Two no. is:"+Mulitply);
}
}
