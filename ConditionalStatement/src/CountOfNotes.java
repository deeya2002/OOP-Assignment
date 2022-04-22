//13. Write a JAVA program to count total number of notes in given amount.
import java.util.Scanner;

public class CountOfNotes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your amount");
        int amount = scanner.nextInt();
        int totalNoOfNotes;
        if(amount%5==0){
            totalNoOfNotes=amount/5;
            System.out.println(totalNoOfNotes);
        }else{
            System.out.println("You must enter valid figures");
        }
    }

}
