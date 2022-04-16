
/*Write a program to find square of a number.
        E.g.- INPUT : 2        OUTPUT : 4
        INPUT : 5        OUTPUT : 25*/
import javax.swing.*;
public class Square {
    public static void main(String[] args) {
        int a,square;
        a=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter a number?"));
        square=a*a;
        JOptionPane.showMessageDialog(null,"The Square:"+square);

    }
}
