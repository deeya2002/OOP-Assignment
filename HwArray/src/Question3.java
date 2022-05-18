import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int num = scanner.nextInt();
        int[] myArray = new int[num];
        for(int i=0;i<myArray.length;i++){
            System.out.print("Enter the number: ");
            myArray[i]= scanner.nextInt();
        }
        find(myArray);

    }

    public static void find(int[] args) {
        int max=0;
        for(int i=0;i< args.length;i++){
            if(args[i]>max){
                max=args[i];
            }

        }
        System.out.println("The maximum value is "+max);
        int min=args[0];
        for(int j=0; j<args.length;j++){
            if(args[j]<min){
                min=args[j];
            }
        }
        System.out.println("The minimum number is "+min);
    }
}

