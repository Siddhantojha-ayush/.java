import java.util.Arrays;
import java.util.Scanner;

public class averageTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("a: ");
        int a = sc.nextInt();

        int number[]=new int [a];



        for(int i = 0; i<a; i++){
            number[i]=sc.nextInt();
        }

        System.out.println(Arrays.toString(number));
        
        int count =0;

        for(int i = 1; i<a-1; i++){
            count= count + number[i];
        }

        System.out.println(count/(a-2));
    }
}
