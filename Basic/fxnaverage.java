import java.util.Scanner;

public class fxnaverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("x: ");
        double x = sc.nextDouble();

        System.out.print("y: ");
        double y = sc.nextDouble();

        System.out.print("z: ");
        double z = sc.nextDouble();

        System.out.print("Average is: " + average(x, y, z));
    }

    public static double average(double x, double y, double z) {
     return (x+y+z) / 3;   
    }
}
