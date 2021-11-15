import java.util.Scanner;

public class ArrayArrangement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        boolean isAscending=true;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                isAscending=false;
            }
        }
        if(isAscending){
            System.out.println("The Array is sorted");
        }
        else
            System.out.println("The Array is not in sorted");
    }
}
