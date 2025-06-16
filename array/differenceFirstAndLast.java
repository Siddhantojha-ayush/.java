import java.util.*;

public class differenceFirstAndLast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Size of array: ");
        int size = sc.nextInt();
        int array[] = new int[size];
        
        for(int i = 0; i<size; i++){
            array[i] = sc.nextInt();
        }

        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        int a = array[0];
        int b = array[size-1];

        System.out.println("The difference is: " + (b-a));
    }
}
