public class SomOfDigit {
    public static void main(String[] args) {
        int digit = sum(1432);
        System.out.println(digit);
    }
    public static int sum(int n) {
       if(n==0){
        return 0;
       }
       return (n%10) + sum(n/10);
    }
}
