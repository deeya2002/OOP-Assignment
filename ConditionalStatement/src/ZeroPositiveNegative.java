//3. Write a JAVA program to check whether a number is negative, positive or zero.
import java.util.Scanner;

public class ZeroPositiveNegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int a = scanner.nextInt();
        if (a==0){
            System.out.println("Zero");
        }else if(a>0){
            System.out.println("Positive");
        }else{
            System.out.println("Negative");
        }
    }
}
