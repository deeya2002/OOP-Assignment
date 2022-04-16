import javax.swing.*;

public class TernaryOperators {
    public static void main(String[] args) {
        int a, b,c ;
        String compare;
        a = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter number?"));
        b = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter number?"));
        c = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter number?"));
        compare =(a==b && a==c)?"All are equal":(a==c||c==b)?"Two are equal":(a==b||c==b)?"Two are equal":"All three are not equal";
        JOptionPane.showMessageDialog(null," input:"+compare);
    }
}
