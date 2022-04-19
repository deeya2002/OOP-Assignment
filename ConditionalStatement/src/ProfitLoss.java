//18. Write a JAVA program to calculate profit or loss.
import java.util.Scanner;

public class ProfitLoss {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the cost price:");
        double CP = scanner.nextDouble();
        System.out.println("Enter the selling price");
        double SP = scanner.nextDouble();
        if (CP-SP>0){
            System.out.println("Loss is"+(CP-SP));
        }else if(CP-SP<0){
            System.out.println("Profit is"+(SP-CP));
        }else{
            System.out.println("Neither Profit nor Loss");
        }
    }
}
