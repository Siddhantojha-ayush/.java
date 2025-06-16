import java.util.Arrays;
import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i = 0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr)); 
        int index= 0;
        System.out.println(sumArray(arr, index));
    }
    static int sumArray(int arr[], int  index){
        if(index == arr.length-1){
            return arr[index];
        }
        int sum = sumArray(arr, index+1);
        return arr[index]+sum;
    }
}
