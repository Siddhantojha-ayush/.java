import java.util.*;

public class findArray {
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
        System.out.println(findArray(arr, index, n));
    }
    static  boolean findArray(int [] arr, int index ,int n){
        if(arr.length == 0){
            return false;
        }
        if(arr[index] == n){
            return true;
        }
        if(index == arr.length-1){
            if(arr[index] == n){
                return true;
            } else{
                return false;
            }
        }
        return findArray(arr, index + 1, n);
    }
}
