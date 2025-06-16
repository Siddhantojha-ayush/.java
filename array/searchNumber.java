import java.util.*;

public class searchNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("a: ");
        int a = sc.nextInt();

        System.out.print("b: ");
        int b = sc.nextInt();

        int number[]=new int [a];

        for(int i = 0; i<a; i++){
            number[i]=sc.nextInt();
        }

        for(int i = 0; i<a; i++){
            if (number[i]==b) {
                System.out.println(i);
            }
        }
    }


    
}
