import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int num= scanner.nextInt();
        if (num<0){
            System.out.println("Please enter a positive number");
        }
        else{
            int i=1;
            int ans =0;
            while(num>0){
                int rem = num%10;
                ans =(ans*10)+rem;
                num/=10;
            }
            System.out.printf("The reverse number is %d.",ans);
        }

    }
}
