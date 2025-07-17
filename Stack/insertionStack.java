import java.util.Stack;

public class insertionStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        // System.out.println(st.size());
        // System.out.println(st);
        st.push(4);
        st.push(5);
        st.push(3);
        st.push(7);
        st.push(9);
        st.push(8);
        System.out.println(st);

        int idx = 2;
        int x = 6;
        Stack<Integer> temp = new Stack<>();
        while(st.size()>idx){
            temp.add(st.pop());
        }
        st.push(x);
        while(temp.size()>0){
            st.add(temp.pop());
        }
        System.out.println(st);
    }
}
