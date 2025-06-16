import java.util.*;

public class sumArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("a: ");
        int a = sc.nextInt();

        int number[]=new int [a];



        for(int i = 0; i<a; i++){
            number[i]=sc.nextInt();
        }
        
        int count =0;

        for(int i = 0; i<a; i++){
            count= count + number[i];
        }

        System.out.println(count);
    }
}
