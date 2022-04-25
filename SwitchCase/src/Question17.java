import java.util.Scanner;

public class Question17 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("Enter your basic salary: ");
        double salary=scanner.nextDouble();

        double HRA,DA;

        switch ( (salary<=10000)?1:(salary<=20000 && salary>10000)?2:(salary>20000)?3:0 ){

            case 1:
                System.out.println("Gross salary is "+ (salary+(0.2*salary)+(0.8*salary)));
                break;

            case 2:
                System.out.println("Gross salary is "+ (salary+(0.25*salary)+(0.9*salary)));
                break;

            case 3:
                System.out.println("Gross salary is "+ (salary+(0.3*salary)+(0.95*salary)));
                break;

            case 0:
                System.out.println("no thing");
                break;

            default:
                System.out.println("invalid");

        }

    }

}
