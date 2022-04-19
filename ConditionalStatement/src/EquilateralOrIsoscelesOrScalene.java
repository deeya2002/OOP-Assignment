//16. Write a JAVA program to check whether the triangle is equilateral, isosceles or scalene triangle.
import java.util.Scanner;

public class EquilateralOrIsoscelesOrScalene {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first side:");
        int a = scanner.nextInt();
        System.out.println("Enter second side:");
        int b = scanner.nextInt();
        System.out.println("Enter third side:");
        int c = scanner.nextInt();
        if (a==b&&b==c){
            System.out.println("It is Equilateral Triangle");
        }else if (a==b||b==c||a==c){
            System.out.println("It is Isosceles Triangle");
        }else{
            System.out.println("It is Scalene Triangle");
        }
    }

}
