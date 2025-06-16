import java.util.Arrays;
import java.util.Scanner;

public class equalArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of first Array: ");
        int size1 = sc.nextInt();
        int array1[] = new int[size1] ;

        for(int i = 0; i<size1; i++){
            array1[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(array1));

        System.out.print("Enter size of second Array: ");
        int size2 = sc.nextInt();
        int array2[] = new int[size2] ;

        for(int i = 0; i<size2; i++){
            array2[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(array2));

        check(array1, array2);

        if (check(array1, array2)) {
            System.out.println("The arrays are equal.");
        } else {
            System.out.println("The arrays are not equal.");
        }
    }

    public static boolean check(int array1[], int array2[]) {
        if (array1.length != array2.length) {
            return false;
        }

        for(int i=0; i<array1.length; i++){
            if (array1[i] != array2[i]) {
                return false;
            }
        }


        return true;
    }
}
