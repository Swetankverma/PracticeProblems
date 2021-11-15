
import java.util.Locale;
import java.util.Scanner;

public class ChangeToUppercase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String name= sc.nextLine();
        System.out.println(name.toUpperCase());
    }
}
