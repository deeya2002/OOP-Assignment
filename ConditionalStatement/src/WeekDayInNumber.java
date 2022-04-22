//11. Write a JAVA program to input week number and print weekday.
import java.util.Scanner;

public class WeekDayInNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Week Number;");
        int weekNumber= scanner.nextInt();
        if(weekNumber == 1) {
            System.out.println("Sunday");
        } else if(weekNumber == 2) {
            System.out.println("Monday");
        } else if(weekNumber== 3) {
            System.out.println("Tuesday");
        } else if(weekNumber == 4) {
            System.out.println("Wednesday");
        } else if(weekNumber == 5) {
            System.out.println("Thursday");
        } else if(weekNumber == 6) {
            System.out.println("Friday");
        } else if(weekNumber == 7) {
            System.out.println("Saturday");
        } else {
            System.out.println("Invalid week days");
        }

    }
}
