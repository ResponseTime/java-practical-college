import java.util.Scanner;

public class Java12 {
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(System.in);
            int a = s.nextInt();
            int b = s.nextInt();
            System.out.println(a / b);
            System.out.println("Aayush Bhattacharjee | 00190302021");
        } catch (ArithmeticException e) {
            System.out.println(e);
            System.out.println("Aayush Bhattacharjee | 00190302021");
        }
    }
}
