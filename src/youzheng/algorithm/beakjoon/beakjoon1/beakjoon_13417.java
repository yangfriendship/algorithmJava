package youzheng.algorithm.beakjoon.beakjoon1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class beakjoon_13417 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(br.readLine());
		for (int i = 0; i < num; i++) {
			br.readLine();
			String input = br.readLine().replace(" ", "");

			char[] arr = input.toCharArray();
			StringBuffer sb = new StringBuffer();
			char curr = arr[0];
			sb.append(curr);
			for (int j = 1; j < arr.length; j++) {

				if (arr[j] > curr) {
					sb.append(arr[j]);
				} else if (arr[j] <= curr) {
					sb.insert(0, String.valueOf(arr[j]));
					curr = arr[j];
				}

			}
			System.out.println(new String(sb));
		}

	}// main
}
