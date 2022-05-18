import java.util.Scanner;

public class Question12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many numbers you want to enter?: ");
        int num = scanner.nextInt();
        int lNum=0;
        int sNum=0;
        for (int i=1; i<=num; i++){
            System.out.println("Enter the number: ");
            int myNum= scanner.nextInt();
            if(myNum>lNum){
                lNum = myNum;
            }
            if(i==1){
                sNum = myNum;
            }
            else if(i!=1&&myNum<sNum){
                sNum=myNum;
            }
        }
        System.out.println("Largest: "+lNum);
        System.out.println("Smallest: "+sNum);
    }
}
