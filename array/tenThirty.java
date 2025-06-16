import java.util.Arrays;
import java.util.Scanner;

public class tenThirty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Size of array: ");
        int size = sc.nextInt();
        int array[] = new int[size];
        
        for(int i = 0; i<size; i++){
            array[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(array));

        int sum = 0;

        check(array, sum);

        if (check(array, sum)) {
            System.out.println("Sum is 30.");
        } else {
            System.out.println("Sum isn't 30.");
        }
    }

    public static boolean check(int array[], int sum) {
        for(int i=0; i<array.length; i++){
            if (array[i] == 10) {
                sum = sum+array[i];
            }
        }
        if (sum == 30) {
            return true;
        }
        return false;
    }
}
