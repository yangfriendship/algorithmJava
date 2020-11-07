package youzheng.algorithm.beakjoon.beakjoon1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class beakjoon_1097 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int input = Integer.parseInt(br.readLine());

		int[] list = new int[7];
		int cnt = 0;
		while (input != 0) {

			if (input - 64 >= 0) {
				input -= 64;
			} else if (input - 32 >= 0) {
				input -= 32;
			} else if (input - 16 >= 0) {
				input -= 16;
			} else if (input - 8 >= 0) {
				input -= 8;
			} else if (input - 4 >= 0) {
				input -= 4;
			} else if (input - 2 >= 0) {
				input -= 2;
			} else if (input - 1 >= 0) {
				input -= 1;
			}
			cnt++;

		}
		System.out.println(cnt);
	}
}
