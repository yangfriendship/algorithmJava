package youzheng.algorithm.beakjoon;

import java.io.BufferedReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class beakjoon_2631 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine().replace(" ", ""));
		}

		int[] dp = new int[n];
		dp[0] = 1;

		for (int i = 1; i < arr.length; i++) {
			int max = 0;

			for (int j = 0; j < i; j++) {

				if (arr[j] < arr[i] && dp[j] > max) {
					max = dp[j];
				}
			}
			dp[i] = max + 1;
		}
		int max = dp[0];
		for (int i = 0; i < dp.length; i++) {
			if (dp[i] > max) {
				max = dp[i];
			}
		}
		System.out.println(n - max);

	}// main
}
