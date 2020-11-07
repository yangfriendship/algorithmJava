package youzheng.algorithm.beakjoon.beakjoon1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class beakjoon_4796 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = 1;
		while (true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int l = Integer.parseInt(st.nextToken());
			int p = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			if (l == 0 && p == 0 && v == 0) {
				break;
			}

			System.out.println(String.format("Case %d: %d", cnt, (v / p) * l + Math.min((v % p), l)));
			
			cnt++;
		}

	}// main
}
