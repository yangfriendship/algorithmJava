package youzheng.algorithm.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class beakjoon_14490 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine().replaceAll(":", " "));

		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());

		int gcd = GCD(a, b);
		StringBuffer sb = new StringBuffer();
		sb.append(a / gcd);
		sb.append(":");
		sb.append(b / gcd);
		System.out.println(sb);
	}// main

	public static int GCD(int a, int b) {

		if (b == 0) {
			return a;
		}

		return GCD(b, a % b);
	}

}
