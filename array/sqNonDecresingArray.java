// revisit
import java.util.Scanner;

// two pointer

public class sqNonDecresingArray {
    static  int[] sortSquare(int []arr){
        int n = arr.length;
        int left = 0; 
        int right = n-1;
        int ans[] = new int[n];
        int k = n-1;

        while(left<=right){
            if(Math.abs(arr[left]) > Math.abs(arr[right])){
                ans[k] = arr[left]*arr[left];
                k--;
                left++;
            } else{
                ans[k]= arr[right]*arr[right];
                k--;
                right--;
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

         if (size < 0) {
            System.out.println("Array size cannot be negative.");
            return;
        }

        int arr[] = new int[size];

        for(int i = 0; i<size; i++ ){
            arr[i] = sc.nextInt();
        }

        int ans[] = sortSquare(arr);

        for(int i = 0; i<ans.length; i++){
            System.out.print(ans[i] + " ");
        }
    }
}
