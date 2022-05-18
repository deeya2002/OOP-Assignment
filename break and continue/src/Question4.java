import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number of factorial value: ");
        int a=scanner.nextInt();
        int fact=1;
        for(int j=1;j<=a;j++){
            fact*=j;
        }
        System.out.println("The factorial of number is "+fact);

    }
}
