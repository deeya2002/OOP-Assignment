/*    WAP to create a function where you have to add all the elements which are the factors of
both 11 and 5. Here, you have to return thus obtained sum.*/
import java.util.Arrays;
import java.util.Scanner;

public class Question5 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the number of element in the array: ");
            int num = scanner.nextInt();
            int[] a = new int[num];
            for(int i= 0 ; i<a.length;i++){
                System.out.print("Enter the number: ");
                a[i]=scanner.nextInt();
            }
            System.out.println(Arrays.toString(a));
            System.out.println(sumFactor5n11(a));
        }
        public static int sumFactor5n11(int[] args){
            int sum=0;
            for(int i=0; i<args.length;i++){
                if(args[i]%5==0&&args[i]%11==0){
                    sum+=args[i];
                }
            }
            return sum;
        }
    }
    class g_reverse{
        public static void main(String[] args) {
            System.out.println(reverseNumber(12345));
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