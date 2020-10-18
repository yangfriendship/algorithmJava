package youzheng.algorithm.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class beakjoon_15649 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int t = Integer.parseInt(st.nextToken());

		int[] arr = new int[n + 1];
		boolean[] visit = new boolean[n + 1];

		for (int i = 1; i < arr.length; i++) {
			arr[i] = i;
		}

		combination(arr, visit, t, 0, "");

	}

	private static void combination(int[] arr, boolean[] visit, int t, int r, String str) {

		if (r == t) {
//			for (int i = 1; i < visit.length; i++) {
//				if (visit[i]) {
//					System.out.print(arr[i] + " ");
//				}
//			}
			System.out.println(str);
			return;
		}

		for (int i = 1; i < arr.length; i++) {

			if (!visit[i]) {
				visit[i] = true;
				combination(arr, visit, t, r + 1, (str + arr[i] + " "));
				visit[i] = false;
			}

		}

	}// main
}
