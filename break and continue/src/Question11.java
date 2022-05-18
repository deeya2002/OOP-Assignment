import java.util.Scanner;

public class Question11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter how many number you want: ");
        int num = scanner.nextInt();
        int countPositive = 0;
        int countNegative = 0;
        int countZero = 0;
        for (int i = 1; i <= num; i++) {
            System.out.print("Enter the number: ");
            int myNum = scanner.nextInt();
            if (myNum > 0) {
                countPositive++;
            } else if (myNum < 0) {
                countNegative++;

            } else if (myNum == 0) {
                countZero++;
            }
        }
        System.out.println("Positive Number: " + countPositive);
        System.out.println("Negative Number: " + countNegative);
        System.out.println("Zero: " + countZero);

    }
    }
