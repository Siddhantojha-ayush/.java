import java.util.*;

public class GCDLD{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		gcdld(x,y);
        System.out.println(gcdld(x,y));
	}
	
	static int gcdld(int x, int y){
		while(x%y!=0){
			int rem = x%y;
			x = y;
            y = rem;
		}
		return y;
	}
}