import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean value=false;
        do{
            System.out.print("Enter the first number: ");
            int a = scanner.nextInt();
            System.out.print("Enter the second number: ");
            int b = scanner.nextInt();
            int sum =a+b;
            System.out.printf("The sum of %d and %d is %d.",a,b,sum);
            System.out.print("Do you want to calculate again?: ");
            String ans = scanner.next();//doesn't stop to take input
            if (ans=="yes"){
                value = true;
            }
            else if(ans=="no"){
                value = false;
            }

        }while(value== true);
    }

}
