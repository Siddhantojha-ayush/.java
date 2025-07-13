
import java.util.Scanner;
import java.util.Stack;

public class copyStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        System.out.print("Enter No. of elements: ");
        int n = sc.nextInt();
        System.out.print("Enter the elements: " + " ");
        for(int i = 0; i<n; i++){
            int x = sc.nextInt();
            st.push(x);
        }
        System.out.println(st);

        // reverse Stack
        Stack<Integer> rt= new Stack<>();
        while(st.size()>0){
            // int x = st.peek();
            // rt.push(x);
            // st.pop();
            rt.push(st.pop());
        }
        System.out.println(rt);

        Stack<Integer> gt= new Stack<>();
        while(rt.size()>0){
            gt.push(rt.pop());
        }
        System.out.println(gt);
    }
}
