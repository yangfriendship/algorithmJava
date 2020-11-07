package youzheng.algorithm.beakjoon.beakjoon1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class beakjoon_7570 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] dp = new int[n + 1];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int max = 0;
		for (int i = 0; i < dp.length - 1; i++) {
			dp[arr[i]] = dp[arr[i] - 1] + 1;
			max = Math.max(max, dp[arr[i]]);
		}
		System.out.println(n - max);

	}// main
}
