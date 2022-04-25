import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = scanner.nextInt();
        int remainder5 = a%5;
        int remainder11 = a%11;
        switch (remainder5){
            case 0:
                System.out.println("It is divisible");
                break;
            default:
                System.out.println("It is not divisible");
                break;

        }
    }
}
