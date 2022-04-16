import java.util.Scanner;

public class StudentPercentage {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter maths marks:");
        double maths= myObj.nextDouble();
        System.out.print("Enter english marks ");
        double english = myObj.nextDouble();
        System.out.print("Enter nepali marks:");
        double nepali= myObj.nextDouble();
        System.out.print("Enter science marks");
        double science = myObj.nextDouble();
        double total = maths+english+nepali+science;
        double per=total/4;
        System.out.println("The total marks is:"+total);
        System.out.println("The total Percentage is:"+per);
        String grade;
        grade = (total>=70.0) ? "First class":(total>=59 && total<70) ? "Upper Second class" : (total>=49 && total <59) ? "Second class" : (total>=0 && total < 39) ? "Third class" : "Fail";
        System.out.println(grade);
    }
}
