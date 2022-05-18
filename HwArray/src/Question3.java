//max&min
import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num =5;
        int[] myArray = new int[num];
        for(int i=0;i<myArray.length;i++){
            System.out.print("Enter the number: ");
            myArray[i]= scanner.nextInt();
        }
        findMinAndMax(myArray);
    }

    public static void findMinAndMax(int[] args) {
        int max=args[0];
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

//public static void findMinAndMax(int[] args) {
//        int[]myArr = new int[]{10,2,13,40,15};
//        int min = myArr[0];
//        int max = myArr[0];
//        for (int i = 1; i<myArr.length;i++)
//        if (min>=myArr[i]){
//        min= myAr[i];
//        }
//        if (max<=myArr[i]){
//        max= myAr[i];
//        }
//            }
//            System.out.println("The minimum value of the array"+min);
//            System.out.println("The minimum value of the array"+max);
