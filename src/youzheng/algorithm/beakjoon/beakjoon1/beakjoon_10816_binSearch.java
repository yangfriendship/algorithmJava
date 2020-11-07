package youzheng.algorithm.beakjoon.beakjoon1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class beakjoon_10816_binSearch {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num1 = Integer.parseInt(br.readLine());
		int[] arr1 = new int[num1];
		int sum = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());

		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = Integer.parseInt(st.nextToken());
		}

		int num2 = Integer.parseInt(br.readLine());
		int[] arr2 = new int[num2];

		st = new StringTokenizer(br.readLine());

		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = Integer.parseInt(st.nextToken());
		}

		int[] result = new int[arr2.length];
		int index = 0;
		Arrays.sort(arr2);
		for (int i = 0; i < arr1.length; i++) {

			index = binSearch(arr2, arr1[i]);
			if (index != -1) {
				result[index]++;
			}
		}

		for (int i = result.length - 1; i >= 0; i--) {
			System.out.printf("%d ", result[i]);
		}

	}

	public static int binSearch(int[] arr, int num) {
		int cnt = 0;
		int mid;
		int left = 0;
		int right = arr.length - 1;

		while (left <= right) {
			mid = (left + right) / 2;

			if (arr[mid] == num) {
				return mid;
			} else {

				if (arr[mid] < num) {
					left = mid + 1;
				} else if (arr[mid] > num) {
					right = mid - 1;
				}

			}

		}

		return -1;
	}

}
