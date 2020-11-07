package youzheng.algorithm.beakjoon.beakjoon1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class beakjoon_6236 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		int[] arr = new int[n];
		int total = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			total += arr[i];
		}

		int cnt = 1;
		int start = 0;
		int end = total;
		int mid = 0;
		int sum = 0;
		while (start <= end) {

			mid = (start + end) / 2;
			sum = mid;
			cnt = 1;
			for (int i = 0; i < arr.length; i++) {

				if (sum - arr[i] < 0) {
					cnt++;
					sum = mid;

				}
				sum -= arr[i];
			}

			if (cnt >= m) {
				start = mid + 1;
			} else if (cnt < m) {
				end = mid - 1;
			}

		}

		System.out.println(end);

	}

}
