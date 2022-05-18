/*WAP to create a function which accepts array as
an parameter and you need to count all those numbers which are factors of 2 .*/
import java.util.Arrays;
import java.util.Scanner;

public class Question4 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the array: ");
            int num = scanner.nextInt();
            int[] ar = new int[num];
            for(int i =0; i<ar.length;i++){
                System.out.print("Enter the number: ");
                ar[i]= scanner.nextInt();
            }
            System.out.println(Arrays.toString(ar));
            System.out.println(countFactorOfTwo(ar));

        }
        public static int countFactorOfTwo(int[] args){
            int count=0;
            for(int i=0;i<args.length;i++){
                if(args[i]==1||args[i]==2){
                    count++;
                }
            }
            return count;
        }
}

