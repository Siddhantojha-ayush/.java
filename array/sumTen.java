import java.util.Arrays;
import java.util.Scanner;

public class sumTen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Size of array: ");
        int size = sc.nextInt();
        int array[] = new int[size];

        // System.out.println(array.length);
        
        for(int i = 0; i<size; i++){
            array[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(array));

        int sum = 0;

        check(array, sum);
        
        if (check(array, sum)) {
            System.out.println("The cumulative sum of the array elements equals 10 at some point.");
        } else {
            System.out.println("The cumulative sum of the array elements does not equal 10 at any point.");
        }
    }
    public static boolean check(int array[], int sum) {
        for(int i=0;i<array.length; i++){
            sum = sum + array[i];
            System.out.println("Cumulative sum up to index " + i + ": " + sum);
            if (sum == 10) {
                return true;
            }
        }
        return false;
    }
}
