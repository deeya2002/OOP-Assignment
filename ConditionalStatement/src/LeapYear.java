//6. Write a JAVA program to check whether a year is leap year or not.
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a year:");
        int year= scanner.nextInt();
        if (year%4==0){
            System.out.println("It is Leap Year");
        }else{
            System.out.println("It is not Leap Year");
        }
    }
}
