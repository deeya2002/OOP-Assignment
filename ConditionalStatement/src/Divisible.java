//4. Write a JAVA program to check whether a number is divisible by 5 and 11 or not.
import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any Number : ");
        int number = scanner.nextInt();
        if((number % 5 == 0) && (number % 11 == 0)) {
            System.out.println("Number is divisible by 5 and 11");
        } else
        {
            System.out.println("Number is not divisible by 5and 11");
        }
    }
}
