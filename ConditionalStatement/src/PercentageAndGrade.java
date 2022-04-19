/*19. Write a JAVA program to input marks of five subjects Physics, Chemistry, Biology, Mathematics and Computer.
 Calculate percentage and grade according to following:
 Percentage >= 90% : Grade A
Percentage >= 80% : Grade B
 Percentage >= 70% : Grade C
 Percentage >= 60% : Grade D
Percentage >= 40% : Grade E
 Percentage < 40% : Grade F */
import java.util.Scanner;

public class PercentageAndGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter marks of Physics:");
        int Physics = scanner.nextInt();
        System.out.println("Enter marks of Chemistry:");
        int Chemistry = scanner.nextInt();
        System.out.println("Enter marks of Biology:");
        int Biology = scanner.nextInt();
        System.out.println("Enter marks of Mathematics:");
        int Mathematics = scanner.nextInt();
        System.out.println("Enter marks of Computer:");
        int Computer = scanner.nextInt();
        int total = Physics+Computer+Chemistry+Biology+Mathematics;
        int percentage= total/4;
        if (percentage>=90){
            System.out.println("Grade A");
        } else if (percentage >= 80){
            System.out.println("Grade B");
        } else if (percentage >= 70){
            System.out.println("Grade C");
        } else if (percentage >= 60){
            System.out.println("Grade D");
        } else if (percentage >= 40){
            System.out.println("Grade E");
        } else if (percentage < 40)
        {
            System.out.println("Grade F");
        }else{
            System.out.println("Fail");
        }
    }
}

