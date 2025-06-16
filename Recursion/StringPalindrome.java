import java.util.Scanner;

public class StringPalindrome {
    public static void  main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int index = s.length()-1;
        String a = palString(s, index);
        System.out.println(a);
        if(a.equals(s)){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
    static String palString(String s, int index){
        if(index<0){
            return "";
        }
        char currentChar = s.charAt(index);
        String restChar = palString(s, index-1);
        return currentChar + restChar;
    }
}
