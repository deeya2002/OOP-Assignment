import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number:: ");
        double a = scanner.nextDouble();

        System.out.println("Enter the second number:: ");
        double b = scanner.nextDouble();

        System.out.println("Enter the third number:: ");
        double c = scanner.nextDouble();

        switch((a>b&&b>c)?1:(b>c&&c>a)?2:(c>b&&b>a)?3:0){
            case 1:
                System.out.print(a+" is greatest");
                break;
            case 2:
                System.out.print(b+" is greatest");
                break;
            case 3:
                System.out.print(c+" is greatest");
                break;
        }
    }
}
