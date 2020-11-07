package youzheng.algorithm.beakjoon.beakjoon1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class beakjoon_2798 {
	static int max = 0;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		int[] arr = new int[n];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);

		rec(arr, 0, 0, 0, m);
		System.out.println(max);

	}

	public static void rec(int[] arr, int r, int n, int sum, int m) {

		if (r < 3) {

			for (int i = n; i <= arr.length - 3 + r; i++) {
				if (r == 2) {
					if ((sum + arr[i]) > max && sum + arr[i] <= m) {
						max = sum + arr[i];
					} else if (sum + arr[i] == m) {
						System.out.println(m);
						return;
					}
				}
				if (r < 2 && sum + arr[i] < m) {
					rec(arr, r + 1, i + 1, sum + arr[i], m);
				}
			}
		}

	}

}
