package youzheng.algorithm.beakjoon.beakjoon1;

import java.io.IOException;
import java.util.Scanner;

public class beakjoon_1010 {

	public static Scanner sc = new Scanner(System.in);

	
	public static void solve(int n, int m) {

		int[][] dp = new int[n + 1][m + 1];

		for (int i = 0; i <= Math.max(n, m); i++) {

			dp[1][i] = i;

		}

		for (int i = 2; i <= n; i++) {

			for (int j = i; j <= m; j++) {

				if (i == j) {
					dp[i][j] = 1;
				} else {
					dp[i][j] = dp[i][j - 1] + dp[i - 1][j - 1];
				}

			}
		}

		System.out.println(dp[n][m]);

	}

	public static void main(String[] args) throws IOException {

		int num = sc.nextInt();
		
		for (int i = 0; i < num; i++) {
			
			int n = sc.nextInt();
			int m = sc.nextInt();
			
			solve(n, m);
			
		}
		
		
	}

}
