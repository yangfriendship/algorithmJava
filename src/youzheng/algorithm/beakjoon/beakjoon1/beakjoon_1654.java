package youzheng.algorithm.beakjoon.beakjoon1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class beakjoon_1654 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());

		int k = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		int[] arr = new int[k];
		for (int i = 0; i < k; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}

		Arrays.sort(arr);
		long start = 0;
		long end = 2147483647;
		long mid;
		while (start <= end) {
			mid = (start + end) / 2;
			long value = check(arr, mid);

			if (value < n) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		System.out.println(start - 1);

	}

	public static long check(int[] arr, long num) {

		long result = 0;

		for (int i = 0; i < arr.length; i++) {
			result += (arr[i]) / num;
		}

		return result;
	}

}
