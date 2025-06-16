import java.util.Arrays;
import java.util.Scanner;

public class numberBetween {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Size of array: ");
        int size = sc.nextInt();
        int array[] = new int[size];
        
        for(int i = 0; i<size; i++){
            array[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(array));

        for(int i=0; i<size; i++){
            if (check(array[i])) {
                System.out.println(array[i] + " is between 65 and 77");
            }else{
                System.out.println(array[i] + " isn't between 65 and 77");
            }
        }
    }

    public static boolean check(int num) {
        return num < 77 && num > 65;
    }
}
