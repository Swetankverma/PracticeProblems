import java.util.Scanner;

public class ArrayTransverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Size of Array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the Element:");
            arr[i]=sc.nextInt();
        }
        System.out.println("To find the number:");
        int x=sc.nextInt();
        for (int i=0;i<arr.length;i++){
        if(x==arr[i])
            System.out.println("The Index of Array is:"+i);}
    }
}
