//average value
import java.util.Scanner;

public class Question1 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int[] num = new int[5];
            for(int j=0;j<num.length;j++){
                System.out.print("Enter the number: ");
                num[j]=scanner.nextInt();
            }
            double average;
            int sum=0;
            for(int i=0; i<num.length;i++){
                sum+=num[i];
            }
            average = sum/num.length+sum%num.length;
            System.out.println("The average value is "+average);
        }
    }

