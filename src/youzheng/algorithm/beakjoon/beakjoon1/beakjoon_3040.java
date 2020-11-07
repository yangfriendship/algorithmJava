package youzheng.algorithm.beakjoon.beakjoon1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class beakjoon_3040 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] arr = new int[9];
		int total = 0;
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			total += arr[i];
		}

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {

				if (total - arr[i] - arr[j] == 100) {

					for (int j2 = 0; j2 < arr.length; j2++) {
						if (j2 != j && j2 != i) {
							System.out.println(arr[j2]);
						}
					}

				}

			}
		}

	}

//	public static int recu(int[] arr, int r, int n, int sum) {
//		if (r == 7) {
//			if(sum == 100) {
//			}
//		} else {
//
//			for (int i = n; i < arr.length - 7 + r; i++) {
//				recu(arr, r + 1, i+1, sum + arr[i]);
//			}
//
//		}
//
//		return sum;
//	}

}
