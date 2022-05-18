/*    WAP to create a function where you have to add all the elements which are the factors of
both 11 and 5. Here, you have to return thus obtained sum.*/
import java.util.Arrays;
import java.util.Scanner;

public class Question5 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the array: ");
            int num = scanner.nextInt();
            int[] a = new int[num];
            for(int i= 0 ; i<a.length;i++){
                System.out.print("Enter the number: ");
                a[i]=scanner.nextInt();
            }
            System.out.println(Arrays.toString(a));
            System.out.println(sumFactor5And11(a));
        }
        public static int sumFactor5And11(int[] args){
            int sum=0;
            for(int i=0; i<args.length;i++){
                if(args[i]%5==0&&args[i]%11==0){
                    sum+=args[i];
                }
            }
            return sum;
        }
    }
