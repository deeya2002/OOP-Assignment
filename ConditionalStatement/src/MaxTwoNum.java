//1. Write a JAVA program to find maximum between two numbers.
import java.util.Scanner;

public class MaxTwoNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = scanner.nextInt();
        System.out.println("Enter second number:");
        int b = scanner.nextInt();
        if (a>b){
            System.out.println("a is maximum");
        }else{
            System.out.println("b is maximum");
        }
    }
}
