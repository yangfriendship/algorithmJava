package youzheng.algorithm.beakjoon.beakjoon1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class beakjoon_2493 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer> stk = new Stack<Integer>();
		int n = Integer.parseInt(br.readLine());
		int cnt = 0;

		int[] arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		StringBuffer sb = new StringBuffer();
		stk.add(0);
		sb.append(0 + " ");
		for (int i = 1; i < arr.length; i++) {

			if (arr[stk.peek()] <= arr[i]) {
				int down = stk.size() - 1;
				while (arr[i] >= arr[stk.get(down)]) {
					stk.pop();
					down--;
					if (stk.isEmpty())
						break;
				}
				if (stk.isEmpty()) {
					sb.append(0 + " ");
					stk.add(i);
				} else {
					sb.append(stk.peek() + 1 + " ");
					stk.add(i);
				}

			} else {
				sb.append(stk.peek() + 1 + " ");
				stk.add(i);
			}

		}
		System.out.println(sb);

	}// main
}
