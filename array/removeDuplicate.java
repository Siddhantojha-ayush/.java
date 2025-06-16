import java.util.Arrays;
import java.util.Scanner;

public class removeDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Size of array: ");
        int size = sc.nextInt();
        int array[] = new int[size];
        
        for(int i = 0; i<size; i++){
            array[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(array));

        int number = check(array);

        System.out.println("New size of array is: " + number);

        System.out.println(Arrays.toString(Arrays.copyOf(array, number)));
    }

    public static int check(int array[]) {
        if (array.length == 1) {
            return 0;
        }

        int unique = 1;

        for(int i=0; i<array.length; i++){
            if (array[i] != array[unique-1]) {
                array[unique] = array[i];
                unique++;
            }
        }

        return unique;
    }
}
