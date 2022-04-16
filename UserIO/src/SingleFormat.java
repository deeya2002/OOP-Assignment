import java.util.Scanner;

public class SingleFormat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Your name:");
        String name = scanner.nextLine();
        System.out.print("Enter your roll number:");
        String roll = scanner.nextLine();
        System.out.print("Enter Your field of interest:");
        String interest = scanner.nextLine();
        System.out.print("Hey,my name is "+name);
        System.out.print(" and my roll number is "+roll+".");
        System.out.print("My field of interest are "+interest+".");
    }
}
