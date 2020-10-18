package youzheng.algorithm.beakjoon;

import java.io.BufferedReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class beakjoon_2606 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());

		int[][] arr = new int[num + 1][num + 1];
		int[] visit = new int[num + 1];

		StringTokenizer st = null;
		int a = 0;
		int b = 0;
		for (int i = 1; i < m + 1; i++) {
			st = new StringTokenizer(br.readLine());
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			arr[a][b] = 1;
			arr[b][a] = 1;
		}


		bfs(arr, visit, m, 1);
		System.out.println(cnt-1);
	}

	public static int cnt = 0;

	public static void bfs(int[][] arr, int[] visit, int m, int depth) {

		visit[depth] = 1;
		cnt++;

		for (int i = 1; i < arr.length; i++) {

			if (arr[depth][i] == 1 && visit[i] == 0) {
				bfs(arr, visit, m, i);
			}

		}

	}

}
