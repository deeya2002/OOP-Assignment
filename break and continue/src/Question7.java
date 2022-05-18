import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in set: ");
        int n = scanner.nextInt();
        int sumEven=0;
        int sumOdd=0;
        for(int i=0; i<n; i++){
            System.out.print("Enter the number: ");
            int num =scanner.nextInt();
            if(num%2==0){
                sumEven+=num;
            }
            else {
                sumOdd+=num;
            }
        }
        System.out.println("The sum of odd number is "+sumOdd);
        System.out.println("The sum of even number is "+sumEven);
    }

}
