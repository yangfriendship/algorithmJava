package youzheng.algorithm.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class beakjoon_2847 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int[] arr = new int[num];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		int cnt = 0;

		for (int i = arr.length - 1; i > 0; i--) {

			if (arr[i] <= arr[i - 1]) {
				cnt += arr[i - 1] - arr[i] + 1;
				arr[i - 1] = arr[i] - 1;
			}

		}
		System.out.println(cnt);

	}// main
}// class
