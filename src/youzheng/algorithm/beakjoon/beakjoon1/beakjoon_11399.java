package youzheng.algorithm.beakjoon.beakjoon1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class beakjoon_11399 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(br.readLine());
		int[] input = new int[num];
		int min = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());

		for (int i = 0; i < input.length; i++) {
			input[i] = Integer.parseInt(st.nextToken());
		}

		for (int i = 0; i < input.length - 1; i++) {
			min = i;
			for (int j = i + 1; j < input.length; j++) {

				if (input[min] > input[j]) {
					min = j;
				}
			}
			int temp = input[min];
			input[min] = input[i];
			input[i] = temp;
		}
		int sum = 0;
		for (int i = 0; i < input.length; i++) {

			sum += input[i] * (input.length - i);

		}
		System.out.println(sum);
	}

}
