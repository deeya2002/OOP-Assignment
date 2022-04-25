import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the character:: ");
        char ch = scanner.next().charAt(0);

        switch ((Character.isLowerCase(ch)?1:Character.isUpperCase(ch)?2:0)){
            case 1:
                System.out.print("The character is lower case.");
                break;
            case 2:
                System.out.print("The character is Upper case.");
                break;
            case 0:
                System.out.print("The character is invalid.");
                break;
        }
    }

}
