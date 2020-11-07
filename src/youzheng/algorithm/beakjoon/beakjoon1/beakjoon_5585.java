package youzheng.algorithm.beakjoon.beakjoon1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class beakjoon_5585 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int input = Integer.parseInt(br.readLine());

		int value = 1000 - input;
		int cnt = 0;
		while (value != 0) {

			if (value - 500 >= 0) {
				value -= 500;
				cnt++;
			} else if (value - 100 >= 0) {
				value -= 100;
				cnt++;
			} else if (value - 50 >= 0) {
				value -= 50;
				cnt++;
			} else if (value - 10 >= 0) {
				value -= 10;
				cnt++;
			} else if (value - 5 >= 0) {
				value -= 5;
				cnt++;
			} else if (value - 1 >= 0) {
				value -= 1;
				cnt++;
			}

		}
		System.out.println(cnt);
	}

}
