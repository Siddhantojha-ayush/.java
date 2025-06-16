import java.util.*;

public class time{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		printMul(n,k);
	}
	
	static void printMul(int n, int k){
		if(k == 0){
			return;
		}
		printMul(n, k-1);
		System.out.println(n*k);
	}
}