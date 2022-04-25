import java.util.Scanner;

public class Question15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a, b, c;
        double root1, root2;

        System.out.print("Enter the first number a: ");
        a = scanner.nextDouble();

        System.out.print("Enter the second number b: ");
        b = scanner.nextDouble();

        System.out.print("Enter the third number c: ");
        c = scanner.nextDouble();

        double determinant = b * b - 4 * a * c;

        switch ((determinant > 0) ? 1 : (determinant == 0) ? 2 : (determinant < 0) ? 3 : 0) {
            case 1:
                root1 = (-b + Math.sqrt(determinant)) / (2 * a);
                root2 = (-b - Math.sqrt(determinant)) / (2 * a);
                System.out.print("The roots are real and different.\nroot1=" + root1 + "\nroot2=" + root2);
                break;
            case 2:
                root1 = root2 = -b / (2 * a);
                System.out.print("The roots are real and equal.\nroot1 and root2 = " + root1);
                break;
            case 3:
                double real = -b / (2 * a);
                double imaginary = Math.sqrt(-determinant) / (2 * a);
                System.out.print("The roots are complex and distinct.\nreal = " + real + "\"" + "\nimaginary= " + imaginary);
                break;
            case 0:
                System.out.print("Invalid");
        }
    }
}
