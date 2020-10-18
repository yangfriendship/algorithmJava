package youzheng.algorithm.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class beakjoon_1038 {
	static int cnt = 0;
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int num = Integer.parseInt(br.readLine());
		
		if(num >= 1022) {
			System.out.println(-1);
			return;
		}
		
		long[] result = new long[num+1];
		int index =0;
		long xiba =0;
		while(index <= num) {
			
			if(solve(xiba)) {
				result[index] = xiba;
				index ++;
				
			}
			
			xiba ++;
		}
		
		System.out.println(result[num]);
		
		

	}
	
	
	public static boolean solve(long n) {
		
		if(n/10 == 0) {
			return true;
		}else if(solve(n/10)){
			
			if(n/10%10 > n%10) {
				return true;
			}
			
		}
		return false;
		
	}
}
