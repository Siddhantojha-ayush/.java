import java.util.Stack;

public class pushLastRec {
    public static void pushLast(Stack<Integer> st, int x){
       if (st.isEmpty()) {
            st.push(x);
            return;
        }

        int top = st.pop();
        pushLast(st, x);
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
        System.out.println(st);
        pushLast(st, 0);
        System.out.println(st);
    }
}
