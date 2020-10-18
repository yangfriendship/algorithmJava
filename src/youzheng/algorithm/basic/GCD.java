package youzheng.algorithm.basic;

public class GCD {

	public static void main(String[] args) {
		int a = 10;
		int b = 100;
		
		System.out.println(GCD(a, b));
	}
	
	public static int GCD(int a, int b) {
		
		if(b==0) {
			return a;
		}
		
		return GCD(b, a%b);
	}
	
}
