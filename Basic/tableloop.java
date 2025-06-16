import java.util.*;

public class tableloop {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        System.out.print("Enter the No.: ");
        int n = sc.nextInt();

        for(int i = 1; i<= 10; i++){
            System.out.println(n + " * " + i + " = " + n*i);
        }
    }
}
