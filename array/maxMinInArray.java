import java.util.*;

public class maxMinInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("a: ");
        int a = sc.nextInt();

        int number[]=new int [a];



        for(int i = 0; i<a; i++){
            number[i]=sc.nextInt();
        }
        
        int max = Arrays.stream(number).max().getAsInt();
        int min = Arrays.stream(number).min().getAsInt();

        System.out.println(max);
        System.out.println(min);
    }

    
}
