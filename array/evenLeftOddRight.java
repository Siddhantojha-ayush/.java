// two pointer
import java.util.Scanner;

public class evenLeftOddRight {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        int size = sc.nextInt(); 
        int arr[] = new int[size];

        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt(); 
        }

        oddEvenSorting(arr);

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    static void oddEvenSorting(int arr[]){
        int left = 0;
        int right = arr.length-1;

        while(left<right){
            if(arr[left]%2!=0 && arr[right]%2==0){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right]= temp;
                // swap(arr, left, right); another function can be created
                left++;
                right--;
            }

             else if(arr[left]%2==0){
                left++;
            }

            else if(arr[right]!=0){
                right--;
            }
        }
    }
}
