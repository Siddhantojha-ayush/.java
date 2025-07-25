import java.util.Stack;

public class displayStackRec {
    public static void displayRevRec(Stack<Integer> st){
        if(st.size()==0) return;
        int top = st.pop();
        System.out.print(top + " ");
        displayRevRec(st);
        st.push(top);
    }
    public static void displayRec(Stack<Integer> st){
        if(st.size()==0) return;
        int top = st.pop();
        displayRec(st);
        System.out.print(top + " ");
        st.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(4);
        st.push(5);
        st.push(3);
        st.push(7);
        st.push(9);
        st.push(8);
        displayRevRec(st);
        System.out.println();
        displayRec(st);
    }
}
