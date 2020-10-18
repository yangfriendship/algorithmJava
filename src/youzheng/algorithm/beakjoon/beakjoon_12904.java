package youzheng.algorithm.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class beakjoon_12904 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s = br.readLine();
		StringBuffer t = new StringBuffer(br.readLine());

		while (t.length() > 0) {

			if (t.charAt(t.length() - 1) == 'A') {
				t.deleteCharAt(t.length() - 1);
			} else if (t.charAt(t.length() - 1) == 'B') {
				t.deleteCharAt(t.length() - 1);
				t.reverse();
			}
			
			
			if (t.length() == s.length()) {
				if (s.equals(new String(t))) {
					System.out.println(1);
					return;
				} else {
					System.out.println(0);
					return;
				}
			} else if (t.length() < s.length()) {
				System.out.println(0);
				return;
			}

		}

	}// main
}
