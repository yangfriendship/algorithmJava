package youzheng.algorithm.beakjoon.beakjoon1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class beakjoon_1541_2 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		br.close();
		String[] arr = input.split("\\-");

		int result = 0;

		String[] start = arr[0].split("\\+");
		for (int i = 0; i < start.length; i++) {
			result += Integer.parseInt(start[i]);
		} // ex) intput = 5 + 5 ~
			// arr[0] == 5+5 �̹Ƿ� runtimeException �߻�

		for (int i = 1; i < arr.length; i++) {
			int sum = 0;

			String[] arr2 = arr[i].split("\\+");

			for (int j = 0; j < arr2.length; j++) {
				sum += Integer.parseInt(arr2[j]);
			}
			result -= sum;

		}
		System.out.println(result);
	}
}
