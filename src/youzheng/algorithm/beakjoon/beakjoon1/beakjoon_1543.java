package youzheng.algorithm.beakjoon.beakjoon1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class beakjoon_1543 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		String word = br.readLine();
		int lastIndex = str.length() - word.length();
		int index = 0;
		int cnt = 0;
		int total = 0;
		int startIndex = 0;
		while (index < lastIndex + 1) {
			cnt = 0;
			for (int i = 0; i < word.length(); i++) {

				if (str.charAt(index + i) == word.charAt(i)) {
					cnt++;
				}

			}

			if (cnt >= word.length()) {
				total++;
				index += word.length();
			} else {
				index++;
			}

		}
		System.out.println(total);
	}

}
