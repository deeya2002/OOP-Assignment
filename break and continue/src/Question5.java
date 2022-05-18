import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base: ");
        int base= scanner.nextInt();
        System.out.print("Enter the power: ");
        int power = scanner.nextInt();
        int i = 1;
        int ans=1;
        while(i<=power){
            ans*=base;
            i++;
        }
        System.out.println("The ans is "+ans);
    }

}
