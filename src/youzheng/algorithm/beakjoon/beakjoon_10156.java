package youzheng.algorithm.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.StringTokenizer;

public class beakjoon_10156 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int k = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		if (m-(k*n)>=0) {
			System.out.println(0);
			return;
		}
		
		int result = Math.abs(m - (k*n));
		System.out.println(result);
		
	}
}
