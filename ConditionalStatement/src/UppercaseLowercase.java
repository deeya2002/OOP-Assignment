////10. Write a JAVA program to check whether a character is uppercase or lowercase alphabet.
import java.util.Scanner;

public class UppercaseLowercase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character");
        char character=scanner.next().charAt(0);
        if(character>='A' && character<='Z'){
            System.out.println(character+" is an upper case letter ");
        }
        else if(character>='a' && character<='z'){
            System.out.println(character+" is a lower case letter ");
        }
        else{
            System.out.println(character+" is not a Alphabets ");
        }

    }
}
