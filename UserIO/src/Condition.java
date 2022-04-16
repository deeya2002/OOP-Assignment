import java.util.Scanner;

public class Condition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the value");
        int a = scanner.nextInt();
        System.out.println("enter second value");
        int b = scanner.nextInt();
        System.out.println(a<50 && a<b);
    }
}
