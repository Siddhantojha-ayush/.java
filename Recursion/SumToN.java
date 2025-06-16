import java.util.*;

public class SumToN{
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
		return n + sumtoN(n-1);
	}
}