import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter first number:");
        int first= myObj.nextInt();
        System.out.print("Enter second number");
        int second = myObj.nextInt();
        System.out.print("Enter third number:");
        int third= myObj.nextInt();
        System.out.print("Enter fourth number");
        int fourth = myObj.nextInt();
        int add=first+second+third+fourth;
        System.out.println("The sum of two numbers is:"+add);

    }
}
