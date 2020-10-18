package youzheng.algorithm.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class beakjoon_2178 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		int[][] arr = new int[n][m];

		for (int i = 0; i < arr.length; i++) {
			String temp = br.readLine();
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = temp.charAt(j) - '0';
			}
		}
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[0].length; j++) {
//				System.out.printf("%2d ", arr[i][j]);
//			}
//			System.out.println();
//		}

		bfs(arr, 0, 0);
		System.out.println(result);

	}

	public static boolean isRng(int[][] arr, int y, int x) {

		if (x >= 0 && y >= 0 && x < arr[0].length && y < arr.length && arr[y][x] == 1) {
			return true;
		}
		return false;
	}

	static int result = 0;

	public static void bfs(int[][] arr, int startX, int startY) {

		Queue<Integer> queX = new LinkedList<>();
		Queue<Integer> queY = new LinkedList<>();

		queX.add(startX);
		queY.add(startY);

		int[][] visit = new int[arr.length][arr[0].length];
		visit[startY][startY] = 1;

		while (!queX.isEmpty() && !queY.isEmpty()) {

			int x = queX.poll();
			int y = queY.poll();

			if (y == arr.length - 1 && x == arr[0].length - 1) {
				result = visit[y][x];
				return;

			}

			if (isRng(arr, y, x + 1) && visit[y][x + 1] == 0) {
				queX.add(x + 1); // right
				queY.add(y);
				visit[y][x + 1] = visit[y][x] + 1;
			}
			if (isRng(arr, y, x - 1) && visit[y][x - 1] == 0) {
				queX.add(x - 1); // left
				queY.add(y);
				visit[y][x - 1] = visit[y][x] + 1;
			}
			if (isRng(arr, y - 1, x) && visit[y - 1][x] == 0) {
				queX.add(x); // up
				queY.add(y - 1);
				visit[y - 1][x] = visit[y][x] + 1;
			}
			if (isRng(arr, y + 1, x) && visit[y + 1][x] == 0) {
				queX.add(x); // down
				queY.add(y + 1);
				visit[y + 1][x] = visit[y][x] + 1;
			}

		}

	}

}
