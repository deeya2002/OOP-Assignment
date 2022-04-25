import java.util.Scanner;

public class Question14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the degree of first angle:: ");
        double a = scanner.nextDouble();

        System.out.print("Enter the degree of second angle:: ");
        double b = scanner.nextDouble();

        System.out.print("Enter the degree of second angle:: ");
        double c = scanner.nextDouble();

        switch ((a==b&&b==c)?1:(a==b||b==c||c==a)?2:3){
            case 1:
                System.out.print("The triangle is a equilateral triangle. ");
            case 2:
                System.out.print("The triangle is a isosceles triangle. ");
            case 3:
                System.out.print("The triangle is a scalene triangle. ");
        }
    }

}
