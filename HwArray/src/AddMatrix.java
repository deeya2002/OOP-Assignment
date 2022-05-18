import java.util.Scanner;

public class AddMatrix
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int row = in.nextInt();
        System.out.println("Enter the number columns");
        int column= in.nextInt();

        int matrix1[][] = new int[row][column];
        int matrix2[][] = new int[row][column];
        int add[][] = new int[row][column];
        System.out.println("Enter the elements of matrix1");
        for (int i= 0 ; i < row ; i++ )
        {
            for (int j= 0 ; j < column ;j++ )
                matrix1[i][j] = in.nextInt();
            System.out.println();
        }
        System.out.println("Enter the elements of matrix2");
        for (int i= 0 ; i < row ; i++ )
        {
            for (int j= 0 ; j < column ;j++ )
                matrix2[i][j] = in.nextInt();
            System.out.println();
        }
        for (int i= 0 ; i < row ; i++ )
            for (int j= 0 ; j < column;j++ )
                add[i][j] = matrix1[i][j] + matrix2[i][j] ;
        System.out.println("Sum of matrices:-");

        for (int i= 0 ; i < row ; i++ )
        {
            for (int j= 0 ; j < column ;j++ )
                System.out.print(add[i][j]+"\t");

            System.out.println();
        }

    }
}