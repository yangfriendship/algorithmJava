package youzheng.algorithm.beakjoon.beakjoon1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class beakjoon_2609 {

	private static int lcm(int a, int b) {

		int x = a > b ? a : b;
		int y = a > b ? b : a;
		int cnt = 1;
		while (y != x) {
			y *= cnt;
			cnt++;
		}

		return y;
	}

	public static int gcd(int a, int b) {
		if (a % b == 0)
			return b;
		return gcd(b, a % b);
	}

	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());

		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());

		System.out.println(gcd(a, b));
		System.out.println(a * b / gcd(a, b));
	}

}
