import java.util.Arrays;
import java.util.Scanner;

public class arrayToArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Row size of array: ");
        int row = sc.nextInt();

        String array[] = new String[row];

        for(int i = 0; i<row; i++){
                array[i] = sc.next(); 
            System.out.println();
        }

        System.out.println(Arrays.asList(array));
    }
}
