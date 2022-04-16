import javax.swing.*;

public class Rectangle {
    public static void main(String[] args) {
        double length,breadth,area;
        length=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter Length?"));
        breadth=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter Breadth?"));
        area=length*breadth;
        JOptionPane.showMessageDialog(null,"The area of rectangle is: "+(int)area);

    }
}
