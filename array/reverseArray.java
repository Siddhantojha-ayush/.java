import java.util.*;

public class reverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Size of array: ");
        int array = sc.nextInt();

        int number[]=new int [array];



        for(int i = 0; i<array; i++){
            number[i]=sc.nextInt();
        }

        System.out.println(Arrays.toString(number));

        for(int i = array - 1; i >= 0; i--){
            System.out.print(number[i]);
        }


    }
}
