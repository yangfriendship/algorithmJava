package youzheng.algorithm.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class beakjoon_15650 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int t = Integer.parseInt(st.nextToken());

		int[] arr = new int[n + 1];
		int[] visit = new int[n + 1];
		for (int i = 1; i < arr.length; i++) {
			arr[i] = i;
		}

		dfs(arr, visit, 0, t, 1);

	}// main

	private static void dfs(int[] arr, int[] visit, int r, int t, int start) {

		if (r == t) {

			for (int i = 1; i < visit.length; i++) {
				if (visit[i] == 1) {
					System.out.printf("%d ", arr[i]);
				}
			}
			System.out.println();

			return;
		}

		for (int i = start; i < arr.length; i++) {

			if (visit[i] == 0) {
				visit[i] = 1;
				dfs(arr, visit, r + 1, t, i);
				visit[i] = 0;
			}

		}

	}
}
