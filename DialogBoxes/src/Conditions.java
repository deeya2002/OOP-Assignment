import javax.swing.*;

public class Conditions {
    public static void main(String[] args) {
        int a,b,c;
        a = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter first variable:"));
        b = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter second variable:"));
        JOptionPane.showMessageDialog(null,"The condition:"+(a<50&&a<b));


    }
}
