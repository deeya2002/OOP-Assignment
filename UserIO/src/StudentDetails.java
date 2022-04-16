import java.util.Scanner;

public class StudentDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Your name:");
        String name = scanner.nextLine();
        System.out.print("Enter your address:");
        String address = scanner.nextLine();
        System.out.print("Enter Your Phone number:");
        String number = scanner.nextLine();
        System.out.print("Enter your date of birth:");
        String dob = scanner.nextLine();

        System.out.println("Name:"+name);
        System.out.println("Your Address:"+address);
        System.out.println("Your phone number:"+number);
        System.out.println("Date of birth:"+dob);
    }
}




