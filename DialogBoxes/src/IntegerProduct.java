import javax.swing.*;

public class IntegerProduct {
    public static void main(String[] args) {
        int a, b, sum, product;
        a = Integer.parseInt(JOptionPane.showInputDialog(null, "First Integer"));
        b = Integer.parseInt(JOptionPane.showInputDialog(null, "Second Integer"));
        sum = a + b;
        product = a * b;
        JOptionPane.showMessageDialog(null, "Sum:" + sum);
        JOptionPane.showMessageDialog(null, "Product:" + product);
    }
}