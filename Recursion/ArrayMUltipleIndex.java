import java.util.Arrays;
import java.util.Scanner;

public class ArrayMUltipleIndex {
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
        mulIndex(arr, index, n);
    }
    static  void  mulIndex(int [] arr, int index ,int n){
        if(arr.length == 0){
            return ;
        }
        if(arr[index] == n){
            System.out.println(index);
        }
        if(index == arr.length-1){
            return;
        }
        mulIndex(arr, index + 1, n);
    }
}
