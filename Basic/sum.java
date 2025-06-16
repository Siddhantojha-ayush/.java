import java.util.Scanner;

public class sum {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first No.: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter Second No.: ");
        int num2 = scanner.nextInt();

        int sum = num1 + num2;
        System.out.println("sum of two no. is: "+ sum);
    }
}
