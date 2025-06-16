import java.util.*;

public class zeroLast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of Array: ");
        int size = sc.nextInt();
        int array[] = new int[size] ;

        for(int i = 0; i<size; i++){
            array[i] = sc.nextInt();
        }

        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        // System.out.println(array[0]);

        
            if (array[0] == 0) {
                array[size] = array[0];
                System.out.println(array);
            }
            else{
                System.out.println("Sahi hai");
            }
        
    }
}
