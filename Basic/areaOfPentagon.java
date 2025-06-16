import java.util.Scanner;

public class areaOfPentagon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("a: ");
        int a = sc.nextInt();

        System.out.print("b: ");
        int b = sc.nextInt();

        System.out.println("Area of pentagon is: " + area(a,b));
    }

    public static double area(int a, int b) {
        return a+b;
    }
}
