// two pointer
import java.util.Scanner;


public class sortArray01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];

        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        sortarray01(arr);

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " " );
        }
    }

    static void sortarray01(int[]arr){
        int left = 0;
        int right = arr.length-1;

        while(left<right){
            if(arr[left]==1 && arr[right]==0){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right]= temp;
                left++;
                right--;
            }

            else if(arr[left]==0){
                left++;
            }

            else if(arr[right] == 1){
                right--;
            }

        }
    }
}
