package youzheng.algorithm.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class beakjoon_1080 {

	static int n;
	static int m;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		st = null;
		int[][] a = new int[n][m];
		int[][] b = new int[n][m];

		for (int i = 0; i < n; i++) {
			String input = br.readLine();
			for (int j = 0; j < m; j++) {
				a[i][j] = input.charAt(j) - '0';
			}
		}

		for (int i = 0; i < n; i++) {
			String input = br.readLine();
			for (int j = 0; j < m; j++) {
				b[i][j] = input.charAt(j) - '0';
			}
		} // �Է�
		int cnt = 0;
		for (int i = 0; i <= n - 3; i++) {

			for (int j = 0; j <= m - 3; j++) {

				if (a[i][j] != b[i][j]) {
					arrReverse(a, i, j);
					cnt++;
				}
			}
		}
		if (Arrays.deepEquals(a, b)) {
			System.out.println(cnt);
		} else {
			System.out.println(-1);
		}

	}

	static void arrReverse(int[][] a, int y, int x) {

		for (int i = y; i < y + 3; i++) {

			for (int j = x; j < x + 3; j++) {

				if (a[i][j] == 0) {
					a[i][j] = 1;
				} else {
					a[i][j] = 0;
				}
			}
		}
	}//

}
