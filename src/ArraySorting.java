import java.util.Scanner;

public class ArraySorting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i=0; i<n;i++){
            System.out.println("Enter the Value of Element:");
            arr[i]=sc.nextInt();
        }
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for (int i=0;i<n;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        if(arr[i]>max){
            max=arr[i];
        }
        }
        System.out.println("The Minimum Value of given:"+min);
        System.out.println("The Maximum Value of Given:" +max);
    }

}
