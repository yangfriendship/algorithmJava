package youzheng.algorithm.beakjoon.beakjoon1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class beakjoon_3079 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		int[] arr = new int[n];
		long max = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}

		Arrays.sort(arr);

		long start = 1;
		long end = arr[arr.length - 1] * m; // �־��� ���
		long mid = 0;
		long sum = 0;
		while (start <= end) {
			sum = 0;
			mid = (start + end) / 2;

			for (int time : arr) {
				sum += mid / time;
			}
			if (sum >= m) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}

		}
		System.out.println(start);

	}

}
