//Write a program to take student details as input and display the result.
import javax.swing.*;

public class Details {
    public static void main(String[] args) {
        String name,address,sec;
        name= JOptionPane.showInputDialog("Name");
        address= JOptionPane.showInputDialog("Address");
        sec= JOptionPane.showInputDialog("Section");
        System.out.println(name);
        System.out.println(address);
        System.out.println(sec);
        JOptionPane.showMessageDialog(null,"Name:"+name+"\n Address: "+address+"\n Section:"+sec);
    }
}
