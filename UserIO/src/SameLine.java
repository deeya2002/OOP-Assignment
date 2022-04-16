import java.util.Scanner;

public class SameLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first string:");
        String first = scanner.nextLine();
        System.out.print("Enter second string:");
        String second = scanner.nextLine();
        String third= first+second;
        System.out.println(third);
    }
}
