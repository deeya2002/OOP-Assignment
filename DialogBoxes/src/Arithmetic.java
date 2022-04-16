//Take side of a square from user and print area and perimeter of it. Also, calculate SI, Area of triangle and Volume of Cube and Cuboid. Take the attributes as user input.
import javax.swing.*;

public class Arithmetic {
    public static void main(String[] args) {
        int length,area,perimeter;
        length=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter Length:"));
        area=length*length;
        perimeter= 4*length;
        JOptionPane.showMessageDialog(null,"Area of square:"+area+"\nPerimeter:"+perimeter);

    }
}

class Simple{
    public static void main(String[] args) {
        int P,T,R,SI;
        P=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter Principal:"));
        T=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter Time:"));
        R=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter Rate:"));
        SI=P*T*R/100;
        JOptionPane.showMessageDialog(null,"SimpleInterest :"+SI);
    }
}

class Triangle{
    public static void main(String[] args) {
        double breadth,height,area;
        breadth=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter Breadth:"));
        height=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter Height:"));
        area=(breadth*height)/2;
        JOptionPane.showMessageDialog(null,"Area of Triangle:"+area);

    }
}

class Volume{
    public static void main(String[] args) {
        double length,breadth,height,cube,cuboid;
        length=Integer.parseInt(JOptionPane.showInputDialog(null,"Length:"));
        breadth=Integer.parseInt(JOptionPane.showInputDialog(null,"Breadth:"));
        height=Integer.parseInt(JOptionPane.showInputDialog(null,"Height:"));
        cube=length*length;
        cuboid=length*breadth*height;
        JOptionPane.showMessageDialog(null,"Volume of Cube:"+cube+"\n Volume of Cuboid"+cuboid);
    }
}