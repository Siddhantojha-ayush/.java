public class SunofNnumbers {
    public static void main(String[] args) {
        int ans  = sum(5);
        System.out.println(ans);
    }
    public static int sum(int n) {
        if(n==0){
            return 0;
        }
        return n + sum(n-1);
    }
}
