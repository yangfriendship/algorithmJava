package youzheng.algorithm.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class beakjoon_7562 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		StringTokenizer st = null;
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {

			int m = Integer.parseInt((br.readLine()));

			st = new StringTokenizer(br.readLine());
			int startX = Integer.parseInt(st.nextToken());
			int startY = Integer.parseInt(st.nextToken());
			st = new StringTokenizer(br.readLine());
			int endX = Integer.parseInt(st.nextToken());
			int endY = Integer.parseInt(st.nextToken());

			bfs(m, startX, startY, endX, endY);
			sb.append(result);
			if (i < n - 1) {
				sb.append("\n");
			}

		}
		System.out.println(sb);

	}//

	static int result = 0;

//+1 +2 +1 +2 -1 -2 -1 -2
	public static void bfs(int size, int x, int y, int endX, int endY) {
		int[] xx = { 1, 2, 2, 1, -1, -2, -2, -1 };
		int[] yy = { -2, -1, 1, 2, 2, 1, -1, -2 };
		Queue<Integer> queX = new LinkedList<Integer>();
		Queue<Integer> queY = new LinkedList<Integer>();
		queX.add(x);
		queY.add(y);
		int[][] visit = new int[size][size];
		int[][] cnt = new int[size][size];
		visit[y][x] = 1;
		cnt[y][x] = 0;
		while (!queX.isEmpty() && !queY.isEmpty()) {

			int qx = queX.poll();
			int qy = queY.poll();
			for (int i = 0; i < 8; i++) {
				int addX = xx[i];
				int addY = yy[i];

				if ((addX + qx) >= 0 && (addX + qx) < size && (addY + qy) >= 0 && (addY + qy) < size) {
					if (visit[addY + qy][addX + qx] == 0) {
						queX.add(addX + qx);
						queY.add(addY + qy);
						cnt[addY + qy][addX + qx] = cnt[qy][qx] + 1;
						visit[addY + qy][addX + qx] = 1;

						if (addY + qy == endY && addX + qx == endX) {
							result = cnt[addY + qy][addX + qx];
							return;
						}
					}

				}
			}

		}

	}
}
