import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the character:");
        char character = scanner.next().charAt(0);

        switch ((character>='a' && character<='z') || (character>='A' && character<='Z')?0:1){
            case 1:
                System.out.print("The character is not alphabet.");
                break;
            case 0:
                System.out.print("The character is a alphabet.");
                break;
        }

    }

}

