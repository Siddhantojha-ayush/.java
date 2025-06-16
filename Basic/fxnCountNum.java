import java.util.*;

public class fxnCountNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Num: ");
        int Num = sc.nextInt();

        System.out.print("Find: ");
        int Find = sc.nextInt();

        int count = fxnCount(Find, Num);

        System.out.println("No. of " + Find + " present in " + Num + " are " + count);
    }

    public static int fxnCount(int Find, int Num) {
        String str = Integer.toString(Num);
        char findChar = Integer.toString(Find).charAt(0);

        int count = 0;
        for(int i=0; i<str.length(); i++){
            if (str.charAt(i)==findChar) {
                count++;
            }
        }
        return count;
    }
}
