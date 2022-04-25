import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = scanner.nextInt();
        System.out.println("Enter second number");
        int b = scanner.nextInt();
        switch ((a <b) ? 0 : (b < a) ? 1 : 2) {
            case 0:
                System.out.println(b + " is maximum");
                break;
            case 1:
                System.out.println(a + " is maximum");
                break;
            default:
                System.out.println("Invalid");

        }
    }
}
