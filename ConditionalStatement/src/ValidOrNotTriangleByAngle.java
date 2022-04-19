//14. Write a JAVA program to input angles of a triangle and check whether triangle is valid or not.
import java.util.Scanner;

public class ValidOrNotTriangleByAngle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter angle A:");
        int A = scanner.nextInt();
        System.out.println("Enter angle B:");
        int B = scanner.nextInt();
        System.out.println("Enter angle C:");
        int C = scanner.nextInt();
        int total=A+B+C;
        if (total==180){
            System.out.println("The triangle is valid");
        }else{
            System.out.println("The triangle is not valid");
        }
    }
}
