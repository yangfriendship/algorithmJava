package youzheng.algorithm.beakjoon.beakjoon1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class beakjoon_4299 {

	static int[] dp = new int[101];
	static int cnt = 0;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a= Integer.parseInt(st.nextToken());
		int b= Integer.parseInt(st.nextToken());

		if((a+b)%2!=0||a<b) {
			System.out.println(-1);
			return;
		}
		
		int x = (a+b)/2;
		int y = a-x;
		
		System.out.printf("%d %d",x,y);
		
	}
}
