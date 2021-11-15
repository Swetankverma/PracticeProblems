public class FirstDigit {
    public static void main(String[] args) {
        int n=4562;
        while (n>10){
            n=n/10;
        }
        System.out.println(n+ " Is First Digit");
    }
}
