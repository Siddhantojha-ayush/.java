public class Q52 {
    public static void main(String args[]){
        String a = "ABACD";
        String t = "CDABA";
        System.out.println(check(a, t));
    }
    public static boolean check(String a, String t) {
        String s = a + a; 
        if (s.contains(t)) {
            return true;
        }
        return false;
    }
}
