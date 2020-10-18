package youzheng.algorithm.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class beakjoon_11725 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		boolean[] visit = new boolean[num + 1];

		LinkedList<Integer>[] list = new LinkedList[num + 1];

		for (int i = 0; i < list.length; i++) {
			list[i] = new LinkedList<Integer>();
		}

		result = new int[num + 1];
		int x = 0;
		int y = 0;
		StringTokenizer st = null;

		for (int i = 1; i < num; i++) {

			st = new StringTokenizer(br.readLine());
			x = Integer.parseInt(st.nextToken());
			y = Integer.parseInt(st.nextToken());

			list[x].add(y);
			list[y].add(x);
		}

		br.close();
		dfs(list, visit, 1);
		for (int i = 2; i < result.length; i++) {
			System.out.println(result[i]);
		}

	}

	static int[] result;

	public static void dfs(LinkedList<Integer>[] list, boolean[] visit, int root) {

		visit[root] = true;
		int num = 0;
		for (int i = 0; i < list[root].size(); i++) {
			num = list[root].get(i);
			if (!visit[num]) {
				result[num] = root;
				dfs(list, visit, num);
			}
		}

	}

	public static void bfs(int[][] arr) {

		Queue<Integer> que = new LinkedList<Integer>();
		que.add(1);
		boolean[] visit = new boolean[arr.length];
		visit[1] = true;
		int n = 0;
		while (!que.isEmpty()) {

			n = que.poll();

			for (int i = 1; i < arr.length; i++) {

				if (!visit[i] && arr[n][i] == 1) {

					visit[i] = true;
					que.add(i);
					result[i] = n;
				}

			}

		}

	}

}
