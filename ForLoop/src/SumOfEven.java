//4. wap to take the initialization and condition for the for loop and print the sum of all the even number present in it.
import java.util.Scanner;



public class SumOfEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the starting number");
        int a = scanner.nextInt();
        System.out.println("Enter the ending number");
        int b = scanner.nextInt();
        int c = 0;
        for(int i=a; i<=b;i+=2) {
            c = c + i;
        }
        System.out.println("Sum of even number is:"+c);
        }
}

