package youzheng.algorithm.beakjoon.beakjoon1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class beakjoon_2309 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[9];
		int total = 0;
		for (int i = 0; i < 9; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			total += arr[i];
		}
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr.length; j++) {

				if (total - (arr[i] + arr[j]) == 100) {
					print(arr, i, j);
					return;
				}

			}

		}

	}

	public static void print(int[] arr, int x, int j) {

		for (int i = 0; i < arr.length; i++) {
			if (i != x && i != j) {
				System.out.println(arr[i]);
			}
		}

	}

}
