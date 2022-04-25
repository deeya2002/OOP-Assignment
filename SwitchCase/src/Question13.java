import java.util.Scanner;

public class Question13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the degree of first side: ");
        double a = scanner.nextDouble();

        System.out.print("Enter the degree of second side: ");
        double b = scanner.nextDouble();

        System.out.print("Enter the degree of second side: ");
        double c = scanner.nextDouble();

        switch ((a+b>c)||(a+c>b)||(b+c>a)?1:2){
            case 1:
                System.out.print("The triangle is valid.");
            case 2:
                System.out.print("The triangle is not valid.");
        }

    }
}

