import java.util.Scanner;

    public class Question22 {
        public static void main(String[] args) {
            Scanner scanner =new Scanner(System.in);

            System.out.println("Enter the number:");
            int num=scanner.nextInt();

            switch(num%2){
                case 0:
                    System.out.println(num+" is an even number");
                    System.out.println("And it's upper nearest odd number is "+ (num+1));
                    break;
                case 1:
                    System.out.println("Don't enter the odd number");
                    break;
                default:
                    System.out.println("invalid");
            }
        }
}

