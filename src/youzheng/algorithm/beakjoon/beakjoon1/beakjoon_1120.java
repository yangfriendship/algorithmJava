package youzheng.algorithm.beakjoon.beakjoon1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class beakjoon_1120 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());

		String a = st.nextToken();
		String b = st.nextToken();
		int min = 99999999;
		int cnt = 0;
		int point = Math.abs(a.length() - b.length());

		for (int i = 0; i < point+1; i++) {
			cnt = 0;
			for (int j = 0; j < a.length(); j++) {
				if (a.charAt(j) != b.charAt(j + i)) {
					cnt++;
				}
			}
			if (cnt < min) {
				min = cnt;
			}
		}

		System.out.println(cnt);

	}
}
