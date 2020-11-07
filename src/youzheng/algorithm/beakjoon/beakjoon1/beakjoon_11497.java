package youzheng.algorithm.beakjoon.beakjoon1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class beakjoon_11497 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		for (int k = 0; k < testCase; k++) {

			int num = Integer.parseInt(br.readLine());
			int[] arr = new int[num];
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int i = 0; i < num; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			Arrays.sort(arr);

			Deque<Integer> que = new LinkedList<Integer>();

			for (int i = arr.length - 1; i >= 0; i--) {

				if (i == arr.length - 1) {
					que.add(arr[i]);
				} else {

					if (i % 2 == 0) {
						que.addFirst(arr[i]);
					} else {
						que.addLast(arr[i]);
					}
				}
			}

			int[] arr2 = new int[arr.length];
			for (int i = 0; i < arr2.length; i++) {
				arr2[i] = que.pollLast();
			}

			int max = 0;

			for (int i = 0; i < arr2.length; i++) {

				if (i != arr2.length - 1) {
					int value = Math.abs(arr2[i] - arr2[i + 1]);
					if (value > max) {
						max = value;
					}
				} else {
					int value = Math.abs(arr2[i] - arr2[0]);
					if (value > max) {
						max = value;
					}
				}

			}

			System.out.println(max);

		}

	}// main

}
