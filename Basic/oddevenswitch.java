import java.util.Scanner;

public class oddevenswitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        System.out.print("Enter the num = ");
        num = sc.nextInt();

        switch (num % 2) {
            case 0:
                System.out.println(num + " is an even number.");
                break;

            case 1:
                System.out.println(num + " is an odd number.");
                break;
        }
    }
}
