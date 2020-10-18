package youzheng.algorithm.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.StringTokenizer;

//N	1	2	3	4	5	6	7	8	9	10	11
//P	2	4	6	9	12	16	20	25	30	36	42
//I	2	2	2	3	3	4	4	5	5	6	6
//
//index = 	x/2+1
public class beakjoon_3004 {

	static int[] dp = new int[101];
	static int cnt = 0;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		dp[1] = 2;
		dp[2] = 4;
		
		for (int i = 2; i < num+1; i++) {
			
			dp[i] = dp[i-1] + (i/2)+1;
		}
		
		System.out.println(dp[num]);
	}
}
