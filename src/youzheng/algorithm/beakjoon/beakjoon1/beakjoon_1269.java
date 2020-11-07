package youzheng.algorithm.beakjoon.beakjoon1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class beakjoon_1269 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		int[] arr = new int[n];
		int[] brr = new int[m];

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < brr.length; i++) {
			brr[i] = Integer.parseInt(st.nextToken());
		}

		int result = 0;
		Arrays.parallelSort(arr);
		Arrays.parallelSort(brr);
		int last = 0;
		for (int i = 0; i < brr.length; i++) {
			int value = brr[i];
			int index = last;
			while (index < arr.length) {

				if (value == arr[index]) {
					cnt++;
					index++;
					last = index;
					break;
				} else {
					index++;
				}
			}
		}
		System.out.println(brr.length - cnt);
		result += brr.length - cnt;
		cnt = 0;
		last = 0;
		for (int i = 0; i < arr.length; i++) {
			int value = arr[i];
			int index = last;
			while (index < brr.length) {

				if (value == brr[index]) {
					cnt++;
					index++;
					last = index;
					break;
				} else {
					index++;
				}
			}
		}
		System.out.println(arr.length - cnt);
		result += arr.length - cnt;
		System.out.println(result);

	}// main
}
