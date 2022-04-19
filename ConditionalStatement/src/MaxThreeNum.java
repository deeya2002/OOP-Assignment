//2. Write a JAVA program to find maximum between three numbers.
import java.util.Scanner;

public class MaxThreeNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = scanner.nextInt();
        System.out.println("Enter second number:");
        int b = scanner.nextInt();
        System.out.println("Enter third number:");
        int c = scanner.nextInt();
        if (a>b && a>c){
            System.out.println("a is maximum");
        }else if(b>a && b>c){
            System.out.println("b is maximum");
        }
        else{
            System.out.println("c is maximum");
        }
    }
}

