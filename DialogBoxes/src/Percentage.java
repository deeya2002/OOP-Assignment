/*
Write a program to take input of the total marks of four subjects of a student and calculate the total percentage secured.
Then display the percentage and final result of the student;
If equal to or more than 70 -> First Class
If more than 59 -> Upper second Class
If more than 49 -> Second class
If more than 39 -> Third class and if below than 40 the result is fail.
*/
import javax.swing.*;
public class Percentage {
    public static void main(String[] args) {
        double sci,math,eng,comp,total,percentage;
        String grade;
        sci=Integer.parseInt(JOptionPane.showInputDialog(null,"Science Marks"));
        math=Integer.parseInt(JOptionPane.showInputDialog(null,"Maths Marks"));
        eng=Integer.parseInt(JOptionPane.showInputDialog(null,"English Marks"));
        comp=Integer.parseInt(JOptionPane.showInputDialog(null,"Computer Marks"));
        total=sci+math+eng+comp;
        percentage=total/4;
        grade = (total>=70.0) ? "First class" :(total>=59 && total<70) ? "Upper Second class" :(total>=49 && total <59) ? "Second class" : (total>=0 && total < 39) ? "Third class" : "Fail";
        JOptionPane.showMessageDialog(null,"The Total is:"+total+"\nThe percentage is"+percentage+"%"+"\nDivision:"+grade);
    }
}
