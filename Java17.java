import java.util.Scanner;

public class Java17 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the operator: ");
        String ch = s.nextLine();
        int x, y;
        switch (ch) {
            case "+":
                System.out.println("Enter two numbers: ");
                x = s.nextInt();
                y = s.nextInt();
                System.out.println("Sum: " + (x + y));
                break;
            case "-":
                System.out.println("Enter two numbers: ");
                x = s.nextInt();
                y = s.nextInt();
                System.out.println("Difference: " + (x - y));
                break;
            case "/":
                System.out.println("Enter two numbers: ");
                x = s.nextInt();
                y = s.nextInt();
                System.out.println("Quotient: " + (x / y));
                break;
            case "*":
                System.out.println("Enter two numbers: ");
                x = s.nextInt();
                y = s.nextInt();
                System.out.println("Product: " + (x * y));
                break;
            default:
                System.out.println("You entered something else");
        }
        System.out.println("Aayush Bhattacharjee | 00190302021");
        s.close();
    }
}
