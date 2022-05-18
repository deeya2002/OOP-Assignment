import java.util.Scanner;

public class Question6 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the number");
            int num = scanner.nextInt();
            System.out.println(reverseNumber(num));
        }
        static int reverseNumber(int num){
            int rev=0;
            while(num!=0){
                int rem = num%10;
                rev=rev*10+rem;
                num/=10;
            }
            return rev;
        }
    }

