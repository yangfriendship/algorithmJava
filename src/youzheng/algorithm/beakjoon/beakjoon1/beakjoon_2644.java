package youzheng.algorithm.beakjoon.beakjoon1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class beakjoon_2644 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());

		int m = Integer.parseInt(br.readLine());

		int[][] arr = new int[num + 1][num + 1];
		int[] visit = new int[num + 1];
		father = new int[num + 1];
		int x = 0;
		int y = 0;
		for (int i = 0; i < m; i++) {

			st = new StringTokenizer(br.readLine());
			x = Integer.parseInt(st.nextToken());
			y = Integer.parseInt(st.nextToken());

			arr[x][y] = 1;
			arr[y][x] = 1;

		}

		bfs(arr, visit, a, b);

		if (father[b] == 0) {
			System.out.println(-1);
		} else {
			System.out.println(father[b]);
		}

	}

	static int[] father;

	public static void bfs(int[][] arr, int[] visit, int root, int b) {

		Queue<Integer> que = new LinkedList<Integer>();
		que.offer(root);
		visit[root] = 1;
		father[root] = 0;
		while (!que.isEmpty()) {

			int num = que.poll();
			for (int i = 1; i < arr.length; i++) {
				if (visit[i] == 0 && arr[num][i] == 1) {
					que.add(i);
					visit[i] = 1;
					father[i] = father[num] + 1;
				}
			}
		}

	}

}
