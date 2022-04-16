import javax.swing.*;

public class Same {
    public static void main(String[] args) {
        String a,b,c;
        a= JOptionPane.showInputDialog(null, "Enter first word");
        b= JOptionPane.showInputDialog(null, "Enter second word");
        c=a+b;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        JOptionPane.showMessageDialog(null,"String: "+c);
    }
}
