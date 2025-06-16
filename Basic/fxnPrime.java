import java.util.Scanner;

public class fxnPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Num: ");
        int Num = sc.nextInt();

        prime(Num);
    }

    public static void prime(int Num) {
        for(int i = 2; i < Num; i++){
            for(int j = 2; j <= Num/2; j++){
                if (Num % j == 0) {
                    System.out.println(j + " is prime");
                }else{
                    System.out.println(j+ " isn't prime");
                }
            }
        }
    }
}
