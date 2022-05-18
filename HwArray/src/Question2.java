import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = scanner.nextInt();
        System.out.println(text(num));
    }
    public static boolean text(int num){
        int[] myArray = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18};
        for(int i=0;i<myArray.length;i++){
            if(myArray[i]==num){
                return true;
            }
        }
        return false;
    }
}
