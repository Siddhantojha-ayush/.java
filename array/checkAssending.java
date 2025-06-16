import java.util.*;

import java.util.Scanner;

public class checkAssending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("a: ");
        int a = sc.nextInt();

        int number[]=new int [a];



        for(int i = 0; i<a; i++){
            number[i]=sc.nextInt();
        }

        for(int i=0; i<a; i++){
            if (number[i] < number[i+1]) {
                i++;
                System.out.println("Array is assending");
            }else{
                System.out.println("Array is not assending");
                break;
            }
        }
    }
}
