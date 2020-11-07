package youzheng.algorithm.beakjoon.beakjoon1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class beakjoon_1783 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[][] arr = new int[n][m];

		
		
		

	}

	static int cnt = 0;

	public static int bfs(int[][] arr, int y, int x) {

		Queue<Integer> queY = new LinkedList<Integer>();
		Queue<Integer> queX = new LinkedList<Integer>();
		queY.add(y);
		queX.add(x);
		int[][] visit = new int[arr.length][arr[0].length];
		visit[y][x] = 1;
		int moveCnt = 0;

		int lastY = 0;
		int lastX = 0;

		while (!queY.isEmpty() && !queX.isEmpty()) {

			int[] moveY = { -2, -1, 1, 2 };
			int[] moveX = { 1, 2, 2, 1 };
			int qy = queY.poll();
			int qx = queX.poll();
			lastY = qy;
			lastX = qx;

			if (moveCnt < 4) {

			} else {

				for (int i = 0; i < 4; i++) {
					int addY = (qy + moveY[i]);
					int addX = (qx + moveX[i]);
					if (isRng(arr, addY, addX) && visit[addY][addX] == 0) {

						queY.add(addY);
						queX.add(addX);
						visit[addY][addX] = visit[qy][qx] + 1;
						if (visit[addY][addX] > cnt) {
							cnt = visit[addY][addX];
						}
					}
				}

			}

		}

		return visit[lastY][lastX];

	}

	public static boolean isRng(int[][] arr, int y, int x) {
		if (y >= 0 && x >= 0 && y < arr.length && x < arr[0].length) {
			return true;
		}
		return false;
	}

}
