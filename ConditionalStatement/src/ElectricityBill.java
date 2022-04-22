import org.w3c.dom.css.CSSUnknownRule;

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        int Units;
        double Amount, Sur_charge, Total_Amount ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the units that you consumed");
        Units= scanner.nextInt();
        if (Units<=50){
            Amount = Units*0.5;
            Sur_charge = 0.2*Amount;
        } else if (Units<=150){
            Amount = 25+((Units-50)*0.75);
            Sur_charge = 0.2*Amount;
        }else if (Units<=250){
            Amount=25+75+((Units-150)*1.20);
            Sur_charge=0.2*Amount;
        }else{
            Amount=25+75+120+((Units-250)*1.50);
            Sur_charge=0.2*Amount;
        }

        Total_Amount=Amount+Sur_charge;
        System.out.println("\n Electricity Bill="+Total_Amount);
    }
}
