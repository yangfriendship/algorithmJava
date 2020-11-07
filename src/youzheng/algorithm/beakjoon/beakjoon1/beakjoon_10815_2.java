package youzheng.algorithm.beakjoon.beakjoon1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class beakjoon_10815_2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num1 = Integer.parseInt(br.readLine());

		Set<Integer> set = new HashSet<Integer>();

		StringTokenizer st = new StringTokenizer(br.readLine());

		int[] tar = new int[num1];
		for (int i = 0; i < num1; i++) {
			tar[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(tar);

		int num2 = Integer.parseInt(br.readLine());

		st = new StringTokenizer(br.readLine());
		int[] arr = new int[num2];
		for (int i = 0; i < num2; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < arr.length; i++) {

			if (binSearch(tar , arr[i])) {
				sb.append("1");
			} else {
				sb.append("0");
			}
			if(i != arr.length-1) {
				sb.append(" ");
			}
		}
		
		System.out.println(new String(sb));

	}

	public static boolean binSearch(int[] arr, int num) {

		int first = 0;
		int end = arr.length - 1;
		int mid;

		while (first <= end) {

			mid = (first + end) / 2;

			if (num == arr[mid]) {
				return true;
			} else {

				if (num < arr[mid]) {
					end = mid - 1;
				} else if (num > arr[mid]) {
					first = mid + 1;
				}

			}

		}

		return false;
	}

}
