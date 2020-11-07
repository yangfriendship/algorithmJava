package youzheng.algorithm.beakjoon.beakjoon1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class beakjoon_16953 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());

		long a = Long.valueOf(st.nextToken());
		long b = Long.valueOf(st.nextToken());
		long cnt = 1;

		Queue<Long> que = new LinkedList<Long>();
		que.add(b);

		while (!que.isEmpty()) {

			long qd = que.poll();

			if (qd == a) {
				break;
			}
			if (qd < a) {
				cnt = -1;
				break;
			}

			if (qd % 2 == 0) {
				cnt++;
				que.add(qd / 2);
			} else if (qd % 10 == 1) {
				cnt++;
				que.add(qd / 10);
			}else {
				cnt = -1;
				break;
			}
		}

		System.out.println(cnt);

	}// main
}
