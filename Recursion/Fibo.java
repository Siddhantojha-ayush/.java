import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int a = (fibo(num));
        System.out.println(a);
    }
    public static int fibo(int num) {
        if (num<2) {
            return num;
        }
        return fibo(num-1) + fibo(num-2);
    }
}
