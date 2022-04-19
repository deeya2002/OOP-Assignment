//8. Write a JAVA program to input any alphabet and check whether it is vowel or consonant.
import java.util.Scanner;

public class VowelConstant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an alphabet");
        char alphabet=  scanner.next().charAt(0);
        if(alphabet == 'a' || alphabet == 'e' || alphabet == 'i' || alphabet == 'o' || alphabet == 'u' ) {
            System.out.println(alphabet + " is vowel");
        }else {
            System.out.println(alphabet + " is consonant");
        }
    }

}
