//Write a program to calculate sum of four numbers taking user input.
import javax.swing.*;

public class FourNumbers {
    public static void main(String[] args) {
        int num1, num2, num3, num4, answer;
        num1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter first number"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter second number"));
        num3 = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter third number"));
        num4 = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter fourth number"));
        answer= num1+num2+num3+num4;
        JOptionPane.showMessageDialog(null,"This sum is"+answer);
    }
}
