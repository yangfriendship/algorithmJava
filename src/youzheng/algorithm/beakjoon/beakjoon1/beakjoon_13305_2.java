package youzheng.algorithm.beakjoon.beakjoon1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class beakjoon_13305_2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(br.readLine());
		long[] dist = new long[num - 1];
		long[] price = new long[num];
		StringTokenizer st = new StringTokenizer(br.readLine());

		for (int i = 0; i < dist.length; i++) {
			dist[i] = Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(br.readLine());

		for (int i = 0; i < price.length; i++) {
			price[i] = Integer.parseInt(st.nextToken());
		}
		long cost = 0;
		for (int i = 1; i < price.length - 1; i++) {

			if (price[i] > price[i - 1]) {
				price[i] = price[i - 1];
				cost += price[i] * dist[i];
			} else {
				cost += price[i] * dist[i];
			}
		}
		cost += price[0] * dist[0];
		System.out.println(cost);

	}
}
