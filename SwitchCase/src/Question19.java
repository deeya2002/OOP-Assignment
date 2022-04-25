import java.util.Scanner;

public class Question19 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        double hours, minutes;
        System.out.println("enter the total hours: ");
        hours=scan.nextDouble();
        System.out.println("enter the total minutes: ");
        minutes=scan.nextDouble();

        double min_in_hr=minutes/60;
        double t_hours=min_in_hr+hours;

        switch((t_hours>0 &&t_hours<=11)? 1:(t_hours>=12 &&t_hours<24?2:3)){
            case 1:
                System.out.println("the total hours is "+t_hours);
                System.out.println("so it is AM.");
                break;
            case 2:
                System.out.println("the total hours is "+t_hours);
                System.out.println("so it is PM.");
                break;
            case 3:
                System.out.println("invalid input");
                break;
            default:
                System.out.println("invalid");
        }
    }

}
