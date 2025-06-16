import java.util.Arrays;
import java.util.Scanner;

public class checkArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Size of array: ");
        int size = sc.nextInt();
        int array[] = new int[size];
        
        for(int i = 0; i<size; i++){
            array[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(array));

        check(array);

        if (check(array)) {
            System.out.println("Array contains both 0 and -1.");
        } else {
            System.out.println("Array does not contain both 0 and -1.");
        }
    }

    public static boolean check(int array[]) {
        boolean hasZero = false;
        boolean hasNegativeOne = false;        

        for(int i=0; i<array.length; i++){
            if (array[i] == 0) {
                hasZero = true;
            }
            if (array[i] == -1) {
                hasNegativeOne = true;
            }
            if (hasZero && hasNegativeOne) {
                return true;
            }
        }
        return false;
    }
}
