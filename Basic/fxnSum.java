import java.util.Scanner;

public class fxnSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("a: ");
        double a = sc.nextDouble();

        System.out.print("b: ");
        double b = sc.nextDouble();

        System.out.print("Sum is: " + sum(a, b));
    }

    public static double sum(double a, double b) {
        return (a+b);
    }
}
