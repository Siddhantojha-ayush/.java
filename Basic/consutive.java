import java.util.Scanner;

public class consutive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Num: ");
        int Num = sc.nextInt();

        System.out.print("Num 2: ");
        int Num2 = sc.nextInt();

        System.out.print("Num 3: ");
        int Num3 = sc.nextInt();

        check(Num, Num2, Num3);
    }

    public static void check(int Num, int Num2, int Num3) {
        if (Num2 == Num + 1 && Num3 == Num +2) {
            System.out.println("consutive");
        }else{
            System.out.println("not consutive");
        }
    }
}
