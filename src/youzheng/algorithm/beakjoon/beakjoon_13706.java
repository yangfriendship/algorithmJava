package youzheng.algorithm.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class beakjoon_13706 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		long s = Long.parseLong(br.readLine());
		long cnt = 0;
		long sum = 0;

		while (sum + cnt < s) {
			cnt++;
			sum += cnt;

		}
		System.out.println(cnt);

	}

}
