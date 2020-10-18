package youzheng.algorithm.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class beakjoon_1966 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());

		StringTokenizer st = null;
		StringBuffer sb = new StringBuffer();
		while (T-- > 0) {
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int index = Integer.parseInt(st.nextToken());
			int[] arr = new int[n];
			Queue<Integer> que = new LinkedList<Integer>();
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < n; i++) {
				int value = Integer.parseInt(st.nextToken());
				arr[i] = value;
				que.add(value);
			}
			Arrays.sort(arr);
			int answer = 0;
			int cnt = arr.length - 1;
			while (!que.isEmpty()) {
				int value = que.poll();
				int target = arr[cnt];
				if (value != arr[cnt]) {
					que.add(value);
					if (index == 0) {
						index = que.size() - 1;
					} else {
						index--;
					}
				} else if (value == arr[cnt]) {
					if (index == 0) {
						answer++;
						break;
					} else {
						cnt--;
						answer++;
						if (index == 0) {
							index = que.size() - 1;
						} else {
							index--;
						}

					}
				}
			}
			sb.append(answer + "\n");

		}
		System.out.println(sb);

	}// main
}
