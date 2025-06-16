import java.util.*;

public class fxnhighest {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("x: ");
        double x = sc.nextDouble();

        System.out.print("y: ");
        double y = sc.nextDouble();

        System.out.print("z: ");
        double z = sc.nextDouble();

        System.out.println("Highest is: " + highest(x, y, z));
    }

    public static double highest(double x, double y, double z) {
        return Math.max(Math.max(x,y), z);
    }
    

}
