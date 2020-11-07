package youzheng.algorithm.beakjoon.beakjoon1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class beakjoon_1874 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Stack<Integer> stk = new Stack<Integer>();
		StringBuffer sb = new StringBuffer();
		int[] arr = new int[N];

		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		int curr = 0;
		int cnt = 1;
		while (curr < N) {
			int target = arr[curr];
			if (target > cnt) {
				sb.append("+\n");
				stk.add(cnt);
				cnt++;
			} else if (target == cnt) {
				cnt++;
				curr++;
				sb.append("+\n-\n");
			} else if (target < cnt) {

				if (stk.peek() == target) {
					stk.pop();
					curr++;
					sb.append("-\n");
				} else {
					System.out.println("NO");
					return;
				}

			}

		}

		System.out.println(sb);

	}// main
}
