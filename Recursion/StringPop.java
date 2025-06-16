import java.util.Scanner;

public class StringPop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int index = 0;
        System.out.println(popString(s,index));
    }
    static String popString(String s, int index){
        if (index == s.length()) {
            return "";
        }

        char currentChar = s.charAt(index);
        
        String smallAns = popString(s, index +1);

        if(currentChar != 'a'){
            return currentChar + smallAns;
        } else {
            return smallAns;
        }
    }
}
