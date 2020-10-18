package youzheng.algorithm.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class beakjoon_2512 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());

		int[] arr = new int[n]; // �� ���ú� �ʿ��� �ݾ�
		int total = 0;
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			total += arr[i];
			if (arr[i] > max) {
				max = arr[i];
			}
		}

		int m = Integer.parseInt(br.readLine()); // ����
		if (total <= m) {
			System.out.println(max);
			return;
		}

		int start = 0;
		int end = m;
		int mid = 0;
		while (start <= end) {
			mid = (start + end) / 2;

			int value = solve(arr, mid);

			if (value > m) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}

		}

		System.out.println(start - 1);

	}

	public static int solve(int[] arr, int num) {

		int result = 0;
		int value = 0;
		for (int i = 0; i < arr.length; i++) {

			value = arr[i];

			if (value <= num) {
				result += value;
			} else if (value > num) {
				result += num;
			}

		}

		return result;
	}

}
