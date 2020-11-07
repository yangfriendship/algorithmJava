package youzheng.algorithm.beakjoon.beakjoon1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class beakjoon_1138 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[num];
		for (int i = 0; i < num; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		Stack<Integer> stk = new Stack<Integer>();
		Stack<Integer> temp = new Stack<Integer>();

		for (int i = arr.length - 1; i >= 0; i--) {
			if (stk.isEmpty()) {
				stk.add(i + 1);
			} else {

				int value = arr[i];
				if (value >= stk.size()) {
					stk.add(i + 1);
				} else {
					while (stk.size() > value) {
						temp.add(stk.pop());
					}
					stk.add(i + 1);
					while (!temp.isEmpty()) {
						stk.add(temp.pop());
					}
				}
			}
		}
		StringBuffer sb = new StringBuffer();

		while (!stk.isEmpty()) {
			sb.append(stk.pop());
			if (!stk.isEmpty()) {
				sb.append(" ");
			}
		}

		System.out.println(new String(sb.reverse()).replace("01", "10"));

	} // main
}
