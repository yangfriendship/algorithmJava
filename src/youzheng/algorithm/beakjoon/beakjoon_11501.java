package youzheng.algorithm.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class beakjoon_11501 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		int t = Integer.parseInt(br.readLine());
		for (int k = 0; k < t; k++) {
			int n = Integer.parseInt(br.readLine());
			int[] arr = new int[n];
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int i = 0; i < arr.length; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			long sum = 0;

			int max = 0;

			for (int i = arr.length - 1; i >= 0; i--) {

				if (arr[i] > max) {
					max = arr[i];
				} else {
					sum += max - arr[i];
				}
			}
			sb.append(sum + "\n");

		} // tastCase
		System.out.println(sb);
	}
}
