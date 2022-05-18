import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number:: ");
        int num1= scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2= scanner.nextInt();
        int n;
        if(num2>num1){
            n=num2;
        }
        else{
            n=num1;
        }
        int hcf=0;
        for(int i=1; i<=n; i++){
            if(i<=num1&&i<=num2)
                if(i%num1==0||i%num2==0){
                    hcf=i;
                }
        }
        System.out.printf("The HCF of %d and %d is %d.",num1,num2,hcf);
    }
}

