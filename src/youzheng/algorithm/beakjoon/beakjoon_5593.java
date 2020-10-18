package youzheng.algorithm.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.StringTokenizer;

public class beakjoon_5593 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String input = br.readLine();

		String addShiliu = input + "0000";

		int[] addShiliu2 = new int[addShiliu.length()+1];
		int[] input2 = new int[input.length()];

		for (int i = 0; i < addShiliu2.length; i++) {
			if(i==addShiliu.length()) break;
			addShiliu2[i] = addShiliu.charAt(addShiliu.length() - 1 - i) - '0';
		}
		for (int i = 0; i < input2.length; i++) {
			input2[i] = input.charAt(input.length() - i - 1) - '0';
		}
		for (int i = 0; i < input2.length; i++) {

			addShiliu2[i] += input2[i];

		}

		for (int i = 0; i < addShiliu2.length; i++) {

			switch (addShiliu2[i]) {
			case 0:
				addShiliu2[i] = 0;
				break;
			case 1:
				addShiliu2[i] = 1;
				break;
			case 2:
				addShiliu2[i] = 0;
				addShiliu2[i + 1] += 1;
				break;
			case 3:
				addShiliu2[i] = 1;
				addShiliu2[i + 1]++;
				break;
			}
		}

		for (int i = addShiliu2.length - 1; i >= 0; i--) {
			if(i==addShiliu2.length-1 && addShiliu2[i]==0) {
				continue;
			}
			System.out.print(addShiliu2[i]);
		}

	}
}
