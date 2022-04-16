import java.util.Scanner;

public class Ternary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first string:");
        int a = scanner.nextInt();
        System.out.print("Enter second string:");
        int b = scanner.nextInt();
        System.out.print("Enter second third:");
        int c = scanner.nextInt();
        String compare;
        compare = (a==b && a==c)?"All are equal":(a==c||c==b)?"Two are equal":(a==b||c==b)?"Two are equal":"All three are not equal";
        System.out.println(compare);
    }
}
