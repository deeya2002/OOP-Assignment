//Take two integer inputs from user. First calculate the sum of two then product of two. Finally, calculate the division of thus obtained sum and product and print the result.
import javax.swing.*;

public class Division {
    public static void main(String[] args) {
        int a,b,sum,product;
        double division;
        a=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter First Integer"));
        b=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter Second Integer"));
        sum=a+b;
        product=a*b;
        division=sum/product;
        JOptionPane.showMessageDialog(null,"Sum:"+sum+"\nProduct:"+product+"\nDivision:"+division);
    }
}
