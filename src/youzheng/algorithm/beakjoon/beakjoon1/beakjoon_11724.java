package youzheng.algorithm.beakjoon.beakjoon1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class beakjoon_11724 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		int[][] arr = new int[n + 1][n + 1];
		flag = new boolean[n + 1];
		visit = new boolean[arr.length];
		int x = 0;
		int y = 0;
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			x = Integer.parseInt(st.nextToken());
			y = Integer.parseInt(st.nextToken());
			arr[y][x] = 1;
			arr[x][y] = 1;
		}
		

		for (int i = 1; i < arr.length; i++) {
			
			if(!visit[i]) {
				bfs(arr, i);
			}
		}
		System.out.println(cnt);
	}//

	static boolean[] flag;
	static int cnt = 0;
	static boolean[] visit;
	public static void bfs(int[][] arr, int root) {
		cnt++;
		Queue<Integer> que = new LinkedList<Integer>();
		que.add(root);
		
		visit[root] = true;
		int num = 0;
		while (!que.isEmpty()) {
			num = que.poll();

			for (int i = 1; i < arr.length; i++) {

				if (!visit[i] && arr[num][i] == 1) {
					visit[i] = true;
					que.add(i);
					flag[i] = true;
				}

			}

		}

	}

}
