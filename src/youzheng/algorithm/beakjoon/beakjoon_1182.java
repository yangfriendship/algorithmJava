package youzheng.algorithm.beakjoon;

import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;

public class beakjoon_1182 {

	static int cnt = 0;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int s = Integer.parseInt(st.nextToken());
		int sum = 0;
		st = new StringTokenizer(br.readLine());

		if (s == 0) {
			System.out.println(1);
			return;
		}

		int[] input = new int[n];

		for (int i = 0; i < n; i++) {
			input[i] = Integer.parseInt(st.nextToken());
		}
		
		back(0,0,input,s);

		System.out.println(cnt);

	}

	public static void back(int i, int sum, int[] input, int s) {

		if (i == input.length) {
			return;
		} else if (input[i] > 0) {
			sum += input[i];
			if (sum == s) {
				cnt++;
			}
		}
		back(i + 1, sum, input, s);
		back(i + 1, sum + input[i], input, s);
	}

}
