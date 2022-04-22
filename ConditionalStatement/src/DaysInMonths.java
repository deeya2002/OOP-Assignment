//12. Write a JAVA program to input month number and print number of days in that month.
import java.util.Scanner;

public class DaysInMonths {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Year:");
        System.out.println("Enter Month Number:");
        int MonthNumber= scanner.nextInt();
        int year= scanner.nextInt();
        int number_of_DaysYnMoth=0;
        if(MonthNumber == 1) {
            System.out.println("January");
            System.out.println("31 Days");
        } else if(MonthNumber == 2) {
            if (year%4==0|| year%400==0|| year%100==0){
                System.out.println("It is Leap Year");
                System.out.println("29 Days");
            }else{
                System.out.println("It is not Leap Year");
                System.out.println("28 Days");
            }
            System.out.println("February");
        } else if(MonthNumber== 3) {
            System.out.println("March");
            System.out.println("31 Days");
        } else if(MonthNumber == 4) {
            System.out.println("April");
            System.out.println("30 Days ");
        } else if(MonthNumber == 5) {
            System.out.println("May");
            System.out.println("31 Days");
        } else if(MonthNumber == 6) {
            System.out.println("June");
            System.out.println("30 Days");
        } else if(MonthNumber== 7) {
            System.out.println("July");
            System.out.println("31 Days");
        } else if(MonthNumber == 8) {
            System.out.println("August");
            System.out.println("31 Days");
        } else if(MonthNumber== 9) {
            System.out.println("September");
            System.out.println("30 Days");
        } else if(MonthNumber == 10) {
            System.out.println("October");
            System.out.println("31 Days");
        } else if(MonthNumber == 11) {
            System.out.println("November");
            System.out.println("30 Days");
        } else if(MonthNumber == 12) {
            System.out.println("December");
            System.out.println("31 Days");
        } else {
            System.out.println("No other months");
        }
    }
}
