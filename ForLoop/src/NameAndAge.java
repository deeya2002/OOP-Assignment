//2.wap to take your name and age as user input and print it 5 times using for loop
import java.util.Scanner;

public class NameAndAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:");
        String a = scanner.nextLine();
        System.out.println("Enter your age:");
        int b = scanner.nextInt();
        for(int i=0;i<=5;i++)
        {
            System.out.println(a+" and "+b);
        }
    }
}
