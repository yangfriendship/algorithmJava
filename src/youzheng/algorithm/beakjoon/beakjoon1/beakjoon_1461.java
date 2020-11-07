package youzheng.algorithm.beakjoon.beakjoon1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class beakjoon_1461 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int max = 0;
		int[] arr = new int[n + 1];
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		arr[n] = 0;
		Arrays.parallelSort(arr);
		int index = Arrays.binarySearch(arr, 0);
		max = Math.abs(arr[0]) > arr[n] ? arr[0] : arr[n] ;
		Stack<Integer> stackL = new Stack<Integer>();
		Stack<Integer> stackR = new Stack<Integer>();
		
		for (int i = index - 1; i >= 0; i--) {
			stackL.add(Math.abs(arr[i]));
		}
		for (int i = index + 1; i < arr.length; i++) {
			stackR.add(arr[i]);
		}
		int sum = 0;
		

		while (!stackL.isEmpty()) {
			sum += (stackL.pop()) * 2;

			for (int i = 0; i < m - 1; i++) {
				if (!stackL.isEmpty()) {
					stackL.pop();
				}
			}
		}
		while (!stackR.isEmpty()) {
			sum += (stackR.pop()) * 2;
			for (int i = 0; i < m - 1; i++) {
				if (!stackR.isEmpty()) {
					stackR.pop();
				}
			}
		}

		System.out.println(sum - Math.abs(max));

	}// main
}
