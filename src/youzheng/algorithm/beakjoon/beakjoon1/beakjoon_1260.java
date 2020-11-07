package youzheng.algorithm.beakjoon.beakjoon1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class beakjoon_1260 {
//	4 5 1 n = ������ ���� , m = ������ ���� , v = Ž���� ������ ������ ��ȣ
//	1 2
//	1 3
//	1 4
//	2 4
//	3 4
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int v = Integer.parseInt(st.nextToken());

		int[][] arr = new int[n + 1][n + 1];
		int[] visit = new int[n + 1];

		int a;
		int b;
		for (int i = 1; i < m + 1; i++) {
			st = new StringTokenizer(br.readLine());
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			arr[a][b] = 1;
			arr[b][a] = 1;
		}

//		for (int i = 1; i < n + 1; i++) {
//			for (int j = 1; j < n + 1; j++) {
//
//				System.out.printf("%2d", arr[i][j]);
//
//			}
//			System.out.println();
//		}

		dfs(arr, visit, v);
		visit = new int[n + 1];
		bfs(arr, visit, v);
		System.out.println(new String(stDfs));
		System.out.println(new String(stBfs));
	}

	static StringBuilder stDfs = new StringBuilder();
	static StringBuilder stBfs = new StringBuilder();

	public static void dfs(int[][] arr, int[] visit, int v) {
		stDfs.append(v + " ");
		visit[v] = 1;

		for (int i = 1; i < arr.length; i++) {
			if (arr[v][i] == 1 && visit[i] == 0) {
				dfs(arr, visit, i);
			}
		}
	}

	public static void bfs(int[][] arr, int[] visit, int v) {

		Queue<Integer> que = new LinkedList<Integer>();
		que.add(v);
		visit[v] = 1;

		while (!que.isEmpty()) {

			int qData = que.poll();
			stBfs.append(qData + " ");

			for (int i = 1; i < arr.length; i++) {

				if (visit[i] == 0 && arr[qData][i] == 1) {
					que.add(i);
					visit[i] = 1;
				}

			}

		}

	}

}
