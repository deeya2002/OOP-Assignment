import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the year:");
        int a = scanner.nextInt();
        int leap= a%4;
        int leap1 = a%400;
        int leap2 = a%100;
        switch (leap){
            case 0:
                System.out.println("It is leap year");
                break;
            default:
                System.out.println("It is not leap year");
                break;

        }
    }
}
