import java.util.Scanner;

public class Question16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the selling price: ");
        double sp = scanner.nextDouble();

        System.out.print("Enter the cost price: ");
        double cp = scanner.nextDouble();

        switch ((cp>sp)?1:(sp>cp)?2:0){
            case 1:
                double loss = cp-sp;
                System.out.print("The loss is "+loss);
                break;
            case 2:
                double profit = sp-cp;
                System.out.print("The profit is "+profit);
                break;
            case 0:
                System.out.print("Both cp and sp are equal");
        }
    }
}

