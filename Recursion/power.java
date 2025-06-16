import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num = sc.nextInt();
        int k = sc.nextInt();
        double a = (power(num, k));
        System.out.println(a);
    }
    static double power(double num, int k) {
        if(k == 0){
            return 1;
        }
        
        if(k<0){
            return 1/power(num, -k);
        }

        double less = power(num, k-1);   
        return num*less;
    }
}
