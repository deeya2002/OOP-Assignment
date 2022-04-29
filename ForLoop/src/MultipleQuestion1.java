//1.Wap to print te first 10 multiple of 2.
import java.util.Scanner;

public class MultipleQuestion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        int a = scanner.nextInt();
        for(int i = 1; i<=10;i++)
        {
            System.out.println(a+"*"+i+"="+a*i);
        }
    }
}
