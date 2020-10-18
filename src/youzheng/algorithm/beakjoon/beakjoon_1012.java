package youzheng.algorithm.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class beakjoon_1012 {

	public static int[][] arr;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(br.readLine());

		for (int a = 0; a < num; a++) {

			StringTokenizer st = new StringTokenizer(br.readLine());

			int m = Integer.parseInt(st.nextToken());
			int n = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());

			arr = new int[m][n];

			int x = 0;
			int y = 0;

			for (int i = 0; i < k; i++) {
				st = new StringTokenizer(br.readLine());
				x = Integer.parseInt(st.nextToken());
				y = Integer.parseInt(st.nextToken());
				arr[x][y] = 1;
			}
			int r = 0;

			for (int i = 0; i < m; i++) {

				for (int j = 0; j < n; j++) {

					if (arr[i][j] == 1) {
						bfs(i, j, n, m);
						arr[i][j] = 0;
						r++;
					}

				}

			}
			System.out.println(r);

		}

	}//

	public static void bfs(int y, int x, int n, int m) {
		// x>=0 , y >=0 , x < m , y < n
		arr[y][x] = 0;

		if (x + 1 < n && arr[y][x + 1] == 1) {
			bfs(y, x + 1, n, m);
		}
		if (x - 1 >= 0 && arr[y][x - 1] == 1) {
			bfs(y, x - 1, n, m);
		}
		if (y + 1 < m && arr[y + 1][x] == 1) {
			bfs(y + 1, x, n, m);
		}
		if (y - 1 >= 0 && arr[y - 1][x] == 1) {
			bfs(y - 1, x, n, m);
		}

	}

}
