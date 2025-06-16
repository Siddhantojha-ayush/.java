// important question***

import java.util.*;

public class alternate {
        public static void main(String args[]){
            Scanner sc= new Scanner(System.in);
            int n = sc.nextInt();
            int ans = sumtoN(n);
            System.out.println(ans);
        }
        
        static int sumtoN(int n){
            if(n == 1){
                return 1;
            }
            if(n%2 == 0){
                return -n + sumtoN(n-1);
            }else{
                return n + sumtoN(n-1);
            }
        }
}