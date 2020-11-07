package youzheng.algorithm.beakjoon.beakjoon1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class beakjoon_5525 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int P = Integer.parseInt(br.readLine());
		String[] pA = { "I", "O", "I" };
		Stack<String> stk = new Stack<String>();
		int n = Integer.parseInt(br.readLine());
		String[] arr = br.readLine().split("");

		stk.add(arr[0]);
		stk.add(arr[1]);
		int combo = 0;
		int cnt = 0;
		for (int i = 2; i < arr.length; i++) {

			stk.add(arr[i]);
			int r = 0;
			boolean check = true;
			if (stk.peek().equals("I")) {
				while (r < 3) {
					if (!((stk.get(stk.size() - 1 - r)).equals(pA[r]))) {
						check = false;
						break;
					}
					r++;
				}

				if (check) {
					combo++;
				} else {
					combo = 0;
				}
				if (combo >= P) {
					cnt++;
				}
			} else if (stk.peek().equals("O")) {
				if (stk.get(stk.size() - 2).equals("O")) {
					combo = 0;
				}
			}

		}

		System.out.println(cnt);

	}// main

}
