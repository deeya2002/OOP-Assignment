import java.util.Scanner;

public class Question8 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the character:: ");
        char a = scanner.next().charAt(0);

        switch((Character.isAlphabetic(a)?1:Character.isDigit(a)?2:0)){
            case 1:
                System.out.print("The character is a alphabet");
                break;
            case 2:
                System.out.print("The character is a Digit.");
                break;
            case 3:
                System.out.print("The character is s special character.");
                break;
        }

    }
}
