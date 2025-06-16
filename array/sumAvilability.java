import java.util.*;

public class sumAvilability {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Sum to search: ");
        int Num = sc.nextInt();

        System.out.print("Size of array: ");
        int size = sc.nextInt();
        int array[] = new int[size];
        
        for(int i = 0; i<size; i++){
            array[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(array));

        findSum(array, Num);
    }

    public static void findSum(int array[], int num){
        boolean found = false;
        for(int i = 0; i<array.length; i++){
            for(int j = 0; i<array.length; j++){
                if (array[i] + array[j] == num) {
                    System.out.println(num + " is avilable as sum of " + array[i] + " " + array[j]);
                    found = true;
                }
                // else{
                //     System.out.println(num + " is not avilable as sum of " + array[i] + " " + array[i]);
                // }
            }
            if (!found) {
                System.out.println(num + " is not available as the sum of any two elements.");
            }
        }   
    }
}
