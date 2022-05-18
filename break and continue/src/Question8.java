import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int num = scanner.nextInt();
        int count = 0;
        if (num < 0) {
            System.out.println("Please enter positive number.");
        } else {
            if (num == 1 || num == 0) {
                System.out.println("The number is not prime.");
            } else {
                for (int i = 1; i <= num; i++) {
                    if (num % i == 0) {
                        count++;
                    }
                }
                if (count == 2) {
                    System.out.println("The number is prime.");
                } else {
                    System.out.println("The number is not prime");
                }
            }
        }
    }
}

