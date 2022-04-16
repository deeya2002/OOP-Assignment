import java.util.Scanner;

public class Robert {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter maths marks:");
        double maths = myObj.nextDouble();
        System.out.print("Enter english marks ");
        double english = myObj.nextDouble();
        System.out.print("Enter nepali marks:");
        double nepali = myObj.nextDouble();
        double total = maths+english+nepali;
        double per=total/3;
        System.out.println("The total marks is:"+total);
        System.out.println("The total Percentage is:"+per);

    }
}
