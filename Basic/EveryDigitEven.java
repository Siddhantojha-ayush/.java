import java.util.Scanner;

public class EveryDigitEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Num: ");
        int Num = sc.nextInt();

        boolean result = check(Num);

        if(result) {
            System.out.println("All digits are even.");
        } else {
            System.out.println("Not all digits are even.");
        }

    }

    public static boolean check(int Num) {
        String strNum = Integer.toString(Num);
        for(int i=0; i<strNum.length(); i++){      
            int digit = strNum.charAt(i);
            if (digit % 2 != 0) {
                return false;
            }
                
        }
        return true;
    }
}
