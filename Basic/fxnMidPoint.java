import java.util.Scanner;

public class fxnMidPoint {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);

        System.out.print("Num: ");
        int Num = sc.nextInt();

        System.out.print("Num 2: ");
        int Num2 = sc.nextInt();

        System.out.print("Num 3: ");
        int Num3 = sc.nextInt();

        midPoint(Num, Num2, Num3);
    }

    public static void midPoint(int Num, int Num2, int Num3) {
        if (Num2 == (Num+Num3)/2) {
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
