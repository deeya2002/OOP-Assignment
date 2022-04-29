//   3. Wap to take the initialization and condition for the for loop and print the even numbers present between it.
import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
            Scanner scanner= new Scanner(System.in);
            System.out.println("enter the starting num");
            int start = scanner.nextInt();
            System.out.println("enter ending num");
            int end= scanner.nextInt();
            for (int i=start; i<=end;i+=2){
                System.out.println(i);
            }
        }
}
