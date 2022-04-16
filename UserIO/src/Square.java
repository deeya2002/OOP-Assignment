import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = scanner.nextInt();
        int sq = num*num;
        System.out.println("The square of "+num+" is "+sq+".");
    }
}

