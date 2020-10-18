package youzheng.algorithm.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class beakjoon_16968 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();

		int[] arr = new int[2];
		int combo = 0;
		int answer = 1;
		char last = 'y';
		for (int i = 0; i < str.length(); i++) {
			char input = str.charAt(i);
			switch (input) {
			case 'd':
				if (!(last == input)) {
					last = input;
					combo = 0;
				}
				if (combo == 2) {
					combo = 1;
				}
				answer *= (10 - combo);
				combo++;

				break;

			case 'c':
				if (!(last == input)) {
					last = input;
					combo = 0;
				}
				if (combo == 2) {
					combo = 1;
				}
				answer *= (26 - combo);
				combo++;
				break;
			}
		}
		System.out.print(answer);
	}// main
}
