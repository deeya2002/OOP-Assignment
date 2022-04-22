//7. Write a JAVA program to check whether a character is alphabet or not.
import java.util.Scanner;
public class Alphabet {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Character : ");
         char character = scanner.next().charAt(0);
        if((character>='a' && character<='z') || (character>='A' && character<='Z')){
            System.out.print(character + " is an alphabet.");
//        if (Character.isAlphabetic(character))use garda ni hunxa
        }else
            System.out.print(character + " is not an alphabet.");
        }
    }



