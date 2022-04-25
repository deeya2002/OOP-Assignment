import java.util.Scanner;

public class Question12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int amt , value,note;
        System.out.print("Enter the amount of money:: ");
        amt = scanner.nextInt();
        System.out.print("Enter the value of each note:: ");
        value = scanner.nextInt();

        switch (value){
            case 5:
                note = amt/5;
                System.out.print("The number of notes are "+note+".");
                break;
            case 10:
                note = amt/10;
                System.out.print("The number of notes are "+note+".");
                break;
            case 20:
                note = amt/20;
                System.out.print("The number of notes are "+note+".");
                break;
            case 50:
                note = amt/50;
                System.out.print("The number of notes are "+note+".");
                break;
            case 100:
                note = amt/100;
                System.out.print("The number of notes are "+note+".");
                break;
            case 500:
                note = amt/500;
                System.out.print("The number of notes are "+note+".");
                break;
            case 1000:
                note = amt/1000;
                System.out.print("The number of notes are "+note+".");
                break;
            default:
                System.out.print("Invalid");
        }

    }

}
