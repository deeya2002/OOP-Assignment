import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter first integer:");
        int first = myObj.nextInt();
        System.out.print("Enter second integer");
        int second = myObj.nextInt();
        int sum =first+second;
        int product=first*second;
        System.out.println("The sum of two numbers is:"+sum);
        System.out.println("The sum of two numbers is:"+product);
    }
}
