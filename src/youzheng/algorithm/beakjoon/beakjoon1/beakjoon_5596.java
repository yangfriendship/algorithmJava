package youzheng.algorithm.beakjoon.beakjoon1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class beakjoon_5596 {
//	100 80 70 60
//	80 70 80 90

	public static BufferedReader br 
			= new BufferedReader(new InputStreamReader(System.in));

	
	public static int solve() throws IOException {
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int sum =0;
		for (int i = 0; i < 4; i++) {
			sum += Integer.parseInt(st.nextToken());
		}
		
		return sum;
	}
	
	public static void main(String[] args) throws IOException {


		int x = solve();
		int y = solve();
		
		System.out.println(x > y ? x : y);

	}
}
