//9. Write a JAVA program to input any character and check whether it is alphabet, digit or special character.
import java.util.Scanner;

public class AlphabetDigitOrSpecial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any character : ");
        char character = scanner.next().charAt(0);
        if((character >= 'a' && character <= 'z') || (character >= 'A' && character <= 'Z')) {
            System.out.println(character + " is an alphabet.");
        } else if(character >= '0' && character<= '9') {
            System.out.println(character + " is a digit.");
        } else {
            System.out.println(character+ " is a special character.");
        }
    }
}
