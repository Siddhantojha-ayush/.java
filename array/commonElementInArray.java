import java.util.*;


public class commonElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of Array: ");
        int size = sc.nextInt();
        int array1[] = new int[size] ;

        for(int i = 0; i<size; i++){
            array1[i] = sc.nextInt();
        }

        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1));

        
        int array2[] = new int[size] ;

        for(int i = 0; i<size; i++){
            array2[i] = sc.nextInt();
        }

        Arrays.sort(array2);
        System.out.println(Arrays.toString(array2));

        int array3[] = new int[size] ;

        for(int i = 0; i<size; i++){
            array3[i] = sc.nextInt();
        }

        Arrays.sort(array3);
        System.out.println(Arrays.toString(array3));

        check(array1, array2, array3);
    }

    public static void check(int array1[], int array2[], int array3[]) {
        for(int i = 0; i<array1.length; i++){
            if (array1[i] == array2[i] && array1[i] == array3[i]) {
                System.out.println("The common no. is: " + array1[i]);
            }
            else{
                System.out.println("Nothing is common ");
            }
        }
    }
}
