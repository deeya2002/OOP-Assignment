import java.util.Scanner;

public class Question1 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int[] nums = new int[5];
            for(int j=0;j<nums.length;j++){
                System.out.print("Enter the number: ");
                nums[j]=scanner.nextInt();
            }
            double average;
            int sum=0;
            for(int i=0; i<nums.length;i++){
                sum+=nums[i];
            }
            average = sum/nums.length+sum%nums.length;
            System.out.println("The average value is "+average);
        }
    }

