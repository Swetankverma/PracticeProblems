import java.util.Scanner;

public class ArrayQuestion {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]= new int[n];
       System.out.println("Enter the array Element:");
       for(int i=0;i<n;i++){
           arr[i]=sc.nextInt();
       }
        for(int i=0;i<=n-2;i++) {
            System.out.println(arr[i]);
        }
    }
}
