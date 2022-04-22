import java.util.Scanner;

public class GrossSalary {
    public static void main(String args[]) {
   Scanner scanner = new Scanner(System.in);
        System.out.println("Enter basic salary");
        double basic_salary = scanner.nextInt();
        if (basic_salary<=10000){
            double gross_salary=basic_salary+0.2*basic_salary+0.8*basic_salary;
            System.out.println(gross_salary);
        }else if(basic_salary<=20000){
            double gross_salary=basic_salary+0.25*basic_salary+0.9*basic_salary;
            System.out.println(gross_salary);
        }else if(basic_salary>20000){
            double gross_salary=basic_salary+0.3*basic_salary+0.95*basic_salary;
            System.out.println(gross_salary);
        }else{
            System.out.println("invalid");
        }
        }

}
