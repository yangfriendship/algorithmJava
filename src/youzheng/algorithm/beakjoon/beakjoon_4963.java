package youzheng.algorithm.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class beakjoon_4963 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		int w = 0;
		int h = 0;
		String str = "";
		int cnt = 0;
		while (true) {
			str = br.readLine();
			if (str.equals("0 0")) {
				System.out.println();
				return;
			}
			st = new StringTokenizer(str);
			w = Integer.parseInt(st.nextToken());
			h = Integer.parseInt(st.nextToken());
			cnt = 0;
			int[][] arr = new int[h][w];

			for (int i = 0; i < h; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 0; j < w; j++) {
					arr[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			for (int i = 0; i < h; i++) {

				for (int j = 0; j < w; j++) {

					if (arr[i][j] == 1) {

						dfs(arr, i, j);
						cnt++;
					}
				}
			}
			System.out.println(cnt);
		}
	}//

	public static void dfs(int[][] arr, int y, int x) {

		arr[y][x] = 0;

		if (x + 1 < arr[0].length && arr[y][x + 1] == 1) {
			dfs(arr, y, x + 1);
		}
		if (x - 1 >= 0 && arr[y][x - 1] == 1) {
			dfs(arr, y, x - 1);
		}
		if (y - 1 >= 0 && arr[y - 1][x] == 1) {
			dfs(arr, y - 1, x);
		}
		if (y + 1 < arr.length && arr[y + 1][x] == 1) {
			dfs(arr, y + 1, x);
		}
		if (x - 1 >= 0 && y - 1 >= 0 && arr[y - 1][x - 1] == 1) {
			dfs(arr, y - 1, x - 1);
		}
		if (x + 1 < arr[0].length && y - 1 >= 0 && arr[y - 1][x + 1] == 1) {
			dfs(arr, y - 1, x + 1);
		}
		if (x - 1 >= 0 && y + 1 < arr.length && arr[y + 1][x - 1] == 1) {
			dfs(arr, y + 1, x - 1);
		}
		if (x + 1 < arr[0].length && y + 1 < arr.length && arr[y + 1][x + 1] == 1) {
			dfs(arr, y + 1, x + 1);
		}

	}
}
