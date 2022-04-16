//Take name, roll number and field of interest from user and print in the format below :Hey, my name is xyz and my roll number is xyz. My field of interest are xyz.
import javax.swing.*;

public class Format {
    public static void main(String[] args) {
        String name,roll,interest;
        name= JOptionPane.showInputDialog(null,"Enter name");
        roll= JOptionPane.showInputDialog(null,"Enter roll number");
        interest= JOptionPane.showInputDialog(null,"Enter field of interest");
        System.out.println("name");
        System.out.println("roll");
        System.out.println("address");
        JOptionPane.showMessageDialog(null,"Hey,my name is "+name+" and my roll number is "+roll+"."+"My field of interest are "+interest+".");
    }
}
