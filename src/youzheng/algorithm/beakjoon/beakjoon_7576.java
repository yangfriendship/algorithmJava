package youzheng.algorithm.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class beakjoon_7576 {
	// 1: �� ��
	// 0 �� ������
	// -1 : �������

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		m = Integer.parseInt(st.nextToken());
		n = Integer.parseInt(st.nextToken());
		Queue<Integer> queY = new LinkedList<Integer>();
		Queue<Integer> queX = new LinkedList<Integer>();

		int[][] arr = new int[n][m];
		boolean flag0 = false;
		boolean flag1 = false;
		for (int i = 0; i < arr.length; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				if (arr[i][j] == 0) {
					flag0 = true;
				} else if (arr[i][j] == 1) {
					queX.add(j);
					queY.add(i);
					flag1 = true;
				}
			}
		}

		if (flag0 == false) {
			System.out.println(0);
			return;
		} else if (flag1 == false) {
			System.out.println(-1);
			return;
		}

		bfs(arr, queY, queX);

		System.out.println(days - 1);

	}

	static int m; // ����
	static int n; // ����
	static int days = 0;

	public static boolean isRng(int y, int x) {

		if (x >= 0 && y >= 0 && x < m && y < n) {
			return true;
		}

		return false;
	}

	public static void bfs(int[][] arr, Queue<Integer> queY, Queue<Integer> queX) {

		int[][] visit = new int[arr.length][arr[0].length];
		for (int i = 0; i < queY.size(); i++) {
			int tempX = queX.poll();
			int tempY = queY.poll();

			visit[tempY][tempX] = 1;
			queX.add(tempX);
			queY.add(tempY);
		}

		while (!queY.isEmpty() && !queX.isEmpty()) {

			int x = queX.poll();
			int y = queY.poll();

			if (visit[y][x] > days) {
				days = visit[y][x];
			}

			if (isRng(y - 1, x) && visit[y - 1][x] == 0 && arr[y - 1][x] == 0) {
				queY.add(y - 1);
				queX.add(x);
				visit[y - 1][x] = visit[y][x] + 1;
			}
			if (isRng(y + 1, x) && visit[y + 1][x] == 0 && arr[y + 1][x] == 0) {
				queY.add(y + 1);
				queX.add(x);
				visit[y + 1][x] = visit[y][x] + 1;
			}
			if (isRng(y, x + 1) && visit[y][x + 1] == 0 && arr[y][x + 1] == 0) {
				queY.add(y);
				queX.add(x + 1);
				visit[y][x + 1] = visit[y][x] + 1;
			}
			if (isRng(y, x - 1) && visit[y][x - 1] == 0 && arr[y][x - 1] == 0) {
				queY.add(y);
				queX.add(x - 1);
				visit[y][x - 1] = visit[y][x] + 1;
			}

		}

		for (int i = 0; i < visit.length; i++) {

			for (int j = 0; j < visit[0].length; j++) {
				if (arr[i][j] == 0 && visit[i][j] == 0) {
					days = 0;
				}
			}

		}

	}

}
