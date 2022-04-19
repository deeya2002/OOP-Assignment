//12. Write a JAVA program to input month number and print number of days in that month.
import java.util.Scanner;

public class DaysInMonths {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Month Number;");
        int MonthNumber= scanner.nextInt();
        if(MonthNumber == 1) {
            System.out.println("January=31Days");
        } else if(MonthNumber == 2) {
            System.out.println("February=28or29Days");
        } else if(MonthNumber== 3) {
            System.out.println("March=31Days");
        } else if(MonthNumber == 4) {
            System.out.println("April=30Days");
        } else if(MonthNumber == 5) {
            System.out.println("May=31days");
        } else if(MonthNumber == 6) {
            System.out.println("June=30days");
        } else if(MonthNumber== 7) {
            System.out.println("July=31Days");
        } else if(MonthNumber == 8) {
            System.out.println("August=31Days");
        } else if(MonthNumber== 9) {
            System.out.println("September=30Days");
        } else if(MonthNumber == 10) {
            System.out.println("October=31Days");
        } else if(MonthNumber == 11) {
            System.out.println("November=30Days");
        } else if(MonthNumber == 12) {
            System.out.println("December=31Days");
        } else {
            System.out.println("No other months");
        }
    }
}
