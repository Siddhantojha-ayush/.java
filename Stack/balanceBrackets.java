import java.util.Scanner;
import java.util.Stack;

public class balanceBrackets {
    public static boolean bracket(String str){
        Stack<Character> st = new Stack<>();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch=='('){
                st.push(ch);
            } else{
               if(st.size()==0) return false;
               if(st.peek()=='(') st.pop();
            }
        }
        if(st.size()>0) return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(bracket(str));
    }
}
