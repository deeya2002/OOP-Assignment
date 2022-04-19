//17. Write a JAVA program to find all roots of a quadratic equation.
import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        double FirstRoot=0, SecondRoot=0;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the value of a ::");
        double a = scanner.nextDouble();

        System.out.println("Enter the value of b ::");
        double b = scanner.nextDouble();

        System.out.println("Enter the value of c ::");
        double c = scanner.nextDouble();

        double determinant = (b*b)-(4*a*c);
        double sqrt = Math.sqrt(determinant);

        if(determinant>0){
            FirstRoot = (-b + sqrt)/(2*a);
            SecondRoot = (-b - sqrt)/(2*a);
            System.out.println("Roots are :: "+ FirstRoot +" and "+SecondRoot);
        }else if(determinant == 0){
            System.out.println("Root is :: "+(-b + sqrt)/(2*a));
        }
    }
}
