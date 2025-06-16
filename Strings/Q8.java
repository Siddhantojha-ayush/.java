public class Q8 {
    public static void main(String[] args) {
        String str = "PHP Exercises and Python Exercises";
        System.out.println(check(str));
    }
    public static boolean  check(String str) {
        return str.contains("and");
    }
}
