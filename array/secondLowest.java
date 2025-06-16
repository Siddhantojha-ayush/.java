import java.util.*;

public class secondLowest {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         System.out.print("Size of array: ");
        int array = sc.nextInt();

        int number[]=new int [array];



        for(int i = 0; i<array; i++){
            number[i]=sc.nextInt();
        }

        System.out.print(Arrays.toString(number));

        System.out.println();

        Arrays.sort(number);

        System.out.print(Arrays.toString(number));

        System.out.println();

        System.out.println(number[1]);
    }
}
