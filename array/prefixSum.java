
import java.util.Scanner;

public class prefixSum {
    static  int[] sumPrefix(int [] arr){
        for(int i=1; i<arr.length; i++){
            arr[i] = arr[i-1] + arr[i];
        }
        return arr;
    }

    static  void printArray(int []arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int arr[] = new int[size];

        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        printArray(arr);
        sumPrefix(arr);
        printArray(arr);
    }
}
