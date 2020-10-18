package youzheng.algorithm.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class beakjoon_14697 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int total = Integer.parseInt(st.nextToken());

		for (int i = 0; i < total / a + 1; i++) {

			for (int j = 0; j < total / b + 1; j++) {

				for (int j2 = 0; j2 < total / c + 1; j2++) {

					if ((i * a) + (j * b) + (c * j2) == total) {
						System.out.println(1);
						return;
					}

				}

			}

		}

		System.out.println(0);
	}//
}
