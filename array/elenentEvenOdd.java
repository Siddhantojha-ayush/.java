import java.util.Arrays;
import java.util.Scanner;

public class elenentEvenOdd {
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
    }

    public static void check(int array[]) {
        for(int i=0; i<array.length; i++){
            if (array[i]%2 == 0) {
                System.err.println(array[i] + " is even.");
            }else{
                System.out.println(array[i] + " is odd.");
            }
        }
    }
}
