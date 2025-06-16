
import java.util.Scanner;

public class bubbleSort {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int size = sc.nextInt();
       int a [] = new int[size];
       
       for (int i = 0; i < size; i++) {
           a[i] = sc.nextInt();
       }

    //    for(int i=0; i<size; i++){
    //     System.out.println(a[i]);
    //    }

    //    System.out.println(bubble (a));

        bubble(a);

        for(int i=0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }
    }
    static void bubble(int [] a){
        int n = a.length;
        for (int i = 0; i < n-1; i++) {
            for(int j=0; j<n-i-1; j++){
                if(a[j]>a[j+1]){
                int temp = a[j];
                a[j] = a[j+1];
                a[j+1] = temp;
                }
            }
        }
    }
}
