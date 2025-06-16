import java.util.Arrays;
import java.util.Scanner;

public class sumMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Row size of array: ");
        int row1 = sc.nextInt();

        System.out.print("Column size of array: ");
        int column1 = sc.nextInt();

        int array[][] = new int[row1][column1];

        for(int i = 0; i<row1; i++){
            for(int j= 0; j<column1; j++){
                array[i][j] = sc.nextInt(); 
            }
            System.out.println();
        }

        System.out.println(Arrays.deepToString(array));

        System.out.print("Row size of array: ");
        int row2 = sc.nextInt();

        System.out.print("Column size of array: ");
        int column2 = sc.nextInt();

        if (row1 != row2 || column1 != column2) {
            System.out.println("Error: Arrays must have the same dimensions to be summed.");
        }

        int array2[][] = new int[row2][column2];

        for(int i = 0; i<row2; i++){
            for(int j= 0; j<column2; j++){
                array2[i][j] = sc.nextInt(); 
            }
            System.out.println();
        }

        System.out.print(Arrays.deepToString(array2));

        int sum[][] = new int[row1][column2];

        for(int i = 0; i<row1; i++){
            for(int j = 0; j<column2; j++){
                sum[i][j] = array[i][j] + array2[i][j];
            }
            System.out.println();
        }

        System.out.print(Arrays.deepToString(sum));
    }
}
