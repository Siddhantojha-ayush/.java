import java.util.Arrays;
import java.util.Scanner;

public class ArrayIndex {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i = 0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int n = sc.nextInt(); 
        int index= 0;
        System.out.println(findIndex(arr, index, n));
    }
    static  int findIndex(int [] arr, int index ,int n){
        if(arr.length == 0){
            return -1;
        }
        if(arr[index] == n){
            return index;
        }
        if(index == arr.length-1){
            if(arr[index] == n){
                return index;
            } else{
                return -1;
            }
        }
        return findIndex(arr, index + 1, n);
    }
}
