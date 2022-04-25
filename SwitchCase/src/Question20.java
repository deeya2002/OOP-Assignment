import java.util.Scanner;

public class Question20 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("enter the number: ");
        double num=scanner.nextDouble();

        switch((num<0)?1:(num>0)?2:3){
            case 1:
                System.out.println("you enter the negative no ");
                System.out.println("so it positive no is "+(num*-1));
                break;
            case 2:
                System.out.println("you enter the positive no ");
                System.out.println("so its negative no is "+(num*-1));
                break;
            case 3:
                System.out.println("you enter the invalid no or zero ");
                break;
            default:
                System.out.println("invalid input");
        }

    }

}
