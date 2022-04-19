//15. Write a JAVA program to input all sides of a triangle and check whether triangle is valid or not.
import java.util.Scanner;

public class ValidOrNotTriangleBySIdes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first side:");
        int A = scanner.nextInt();
        System.out.println("Enter second side:");
        int B = scanner.nextInt();
        System.out.println("Enter third side:");
        int C = scanner.nextInt();
        if(A+B>C&&B+C>A&&A+C>B){
            System.out.println("It is a valid Triangle");
        }else{
            System.out.println("It is not a valid triangle");
        }
    }
}