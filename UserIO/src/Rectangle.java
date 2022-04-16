import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter length:");
        double length = myObj.nextDouble();
        System.out.print("Enter breadth:");
        double breadth = myObj.nextDouble();
        double area= length*breadth;
        System.out.println("The sum of two numbers is:"+(int)area);

    }
}
