import java.util.Scanner;
public class Functions {
    //Fuction Bnya
public static void printMyName(String name ){
    System.out.println(name);
    return;
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the name you want to Print::");
        String name=sc.next();
        printMyName(name); //Call kiya function ko...
    }
}
