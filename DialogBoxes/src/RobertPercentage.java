import javax.swing.*;

public class RobertPercentage {
    public static void main(String[] args) {
        double math,eng,comp,total,percentage,b;
        String grade;
        b=100;
        math=Integer.parseInt(JOptionPane.showInputDialog(null,"Maths"));
        eng=Integer.parseInt(JOptionPane.showInputDialog(null,"English"));
        comp=Integer.parseInt(JOptionPane.showInputDialog(null,"Computer"));
        total=math+eng+comp;
        percentage=total/3;
        grade = (total>=70.0) ? "First class" :(total>=59 && total<70) ? "Upper Second class" :(total>=49 && total <59) ? "Second class" : (total>=0 && total < 39) ? "Third class" : "Fail";
        JOptionPane.showMessageDialog(null,"The Total is:"+total+"\nThe percentage is"+percentage+"%"+"\nDivision:"+grade);
    }
}
