package youzheng.algorithm.beakjoon.beakjoon1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class beakjoon_14916 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int cnt = 0;
		while (n > 0) {

			if (n % 5 == 0) {
				cnt += n / 5;
				n = 0;
				break;
			} else {
				n -= 2;
				cnt++;
			}
		}

		if (n < 0) {
			System.out.println(-1);
		} else {
			System.out.println(cnt);
		}

	}

}
