package youzheng.algorithm.beakjoon.beakjoon1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class beakjoon_13305 {
//	4
//	2 3 1
//	5 2 4 1
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
		for (int i = 0; i < price.length - 2; i++) {

			for (int j = i + 1; j < price.length - 1; j++) {

				if (dist[j] == 0) {
					break;
				} else if (price[i] < price[j]) {
					dist[i] += dist[j];
					dist[j] = 0;
				}
			}

		}

		for (int i = 0; i < dist.length; i++) {
			cost += dist[i] * price[i];
		}

		for (int i = 0; i < dist.length; i++) {
			System.out.printf("%d�� ���ÿ��� %d�� �������� %d���͸� ������ : %d \n", i + 1, price[i], dist[i], price[i] * dist[i]);
		}

		System.out.println(cost);
	}// main
}// class
