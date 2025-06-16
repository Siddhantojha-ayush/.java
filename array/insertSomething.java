import java.util.*;

public class insertSomething {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Position of int: ");
        int a = sc.nextInt();

        System.out.print("int to insert: ");
        int b = sc.nextInt();

        System.out.print("Size of array: ");
        int array = sc.nextInt();

        int number[]=new int [array];



        for(int i = 0; i<array; i++){
            number[i]=sc.nextInt();
        }

        System.out.print(Arrays.toString(number));

        System.out.println();

        number[a] = b;

        System.out.print(Arrays.toString(number));
        
    }
}
