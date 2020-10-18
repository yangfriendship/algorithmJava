package youzheng.algorithm.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class beakjoon_2428 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(br.readLine());
		int[] arr = new int[num];
		StringTokenizer st = new StringTokenizer(br.readLine());

		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(arr);
		long sum = 0;
		for (int i = 0; i < arr.length - 1; i++) {

			long result = binSearch(arr, arr[i], i);

			if (result == -1) {
				sum += arr.length - 1 - i;
			} else {
				sum += result - i;

			}

		}
		System.out.println(sum);

	}

	public static int binSearch(int[] arr, int num, int i) {
		int mid;
		int first = i;
		int end = arr.length - 2; // n�� n+1�� �� �ϱ� ������, ArrayIndexOutOfBoundsException

		while (first <= end) {

			mid = (first + end) / 2;
			boolean comPareMid = isTarget(num, arr[mid]);
			boolean comPareMid1 = isTarget(num, arr[mid + 1]);
			if (!comPareMid && comPareMid1) {
				return mid;
			} else {

				if (comPareMid && comPareMid1) {
					end = mid - 1;
				} else if (!comPareMid && !comPareMid1)
					first = mid + 1;
			}
		}
		return -1;
	}

	public static boolean isTarget(int a, int b) {

		if (a <= b && (10 * a) >= (9 * b)) {
			return false;
		}

		return true;
	}

}
