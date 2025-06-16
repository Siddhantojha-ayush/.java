import java.util.Scanner;

public class StingReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int index = s.length()-1;
        // System.out.println(index);
        System.out.println(reveseString(s, index));
    }
    static String reveseString(String s, int index){
        if(index<0){
            return "";
        }
        char currentChar = s.charAt(index);
        String restChar = reveseString(s, index-1);
        return currentChar+restChar;
    }
}
