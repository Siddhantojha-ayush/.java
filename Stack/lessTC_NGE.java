
import java.util.Stack;

public class lessTC_NGE {
    public static int[] NGE(int[] arr){
        Stack<Integer> st = new Stack<>();
        int res[] = new int[arr.length];
        int n = arr.length;
        res[n-1] = -1;
        st.push(arr[n-1]);
        for(int i=n-2; i>=0; i--){
            while(st.size()>0 && arr[i]>=st.peek()){
                st.pop();
            }
            if(st.isEmpty()) res[i] = -1;
            else res[i] = st.peek();
            st.push(arr[i]);
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr= {1,3,4,6,8,4,8,0};
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int ans[] = NGE(arr);
        for(int i=0; i<ans.length; i++){
            System.out.print(ans[i]+" ");
        }
    }
}
