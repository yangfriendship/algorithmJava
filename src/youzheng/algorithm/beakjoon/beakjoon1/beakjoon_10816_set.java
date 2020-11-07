package youzheng.algorithm.beakjoon.beakjoon1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class beakjoon_10816_set {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum = 0;
		final int MAX = 100000000;
		int num1 = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int value = 0;
		for (int i = 0; i < num1; i++) {
			int input = Integer.parseInt(st.nextToken());
			try {
				value = map.get(input);
			} catch (Exception e) {
				value = MAX;
			}

			if (value != MAX) {
				map.put(input, value + 1);
			} else if (value == MAX) {
				map.put(input, 1);
			}
		}

		int num2 = Integer.parseInt(br.readLine());

		int[] arr = new int[num2];
		int[] result = new int[num2];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		int target = 0;

		for (int i = 0; i < arr.length; i++) {

			try {
				target = map.get(arr[i]);
			} catch (Exception e) {
				target = MAX;
			}

			if (target != MAX) {
				result[i] = target;
			}

		}

		for (int i = 0; i < result.length; i++) {
			System.out.printf("%d ", result[i]);
		}

	}
}
