package youzheng.algorithm.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class beakjoon_2504_2 {
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] input = br.readLine().split("");
		Stack<String> stk = new Stack<String>();

		try {
			for (int i = 0; i < input.length; i++) {
				String value = input[i];

				if (value.equals("(") || value.equals("[")) {
					stk.add(value);
				} else if (value.equals(")")) {
					int sum = 0;
					if (stk.peek().equals("(")) {
						stk.pop();
						stk.add("2");
					} else if (checkInt(stk.peek())) {
						while (checkInt(stk.peek())) {
							sum += Integer.parseInt(stk.pop());
						}
						if (stk.peek().equals("[")) {
							System.out.println(0);
							return;
						} else if (stk.peek().equals("(")) {
							stk.pop();
							stk.add(String.valueOf(sum * 2));
						}

					}

				} else if (value.equals("]")) {

					if (stk.peek().equals("[")) {
						stk.pop();
						stk.add("3");
					} else if (checkInt(stk.peek())) {
						int sum = 0;
						while (checkInt(stk.peek())) {
							sum += Integer.parseInt(stk.pop());
						}
						if (stk.peek().equals("(")) {
							System.out.println(0);
							return;
						} else if (stk.peek().equals("[")) {
							stk.pop();
							stk.add(String.valueOf(sum * 3));
						}

					}

				}

			}
		} catch (Exception e) {
			System.out.println(0);
			return;
		}
		
	
		try {
			int sum = 0;
			while (!stk.isEmpty()) {
				sum += Integer.parseInt(stk.pop());
			}

			System.out.println(sum);
		} catch (Exception e) {
			System.out.println(0);
		}
	}// main

	private static boolean checkInt(String value) {

		try {
			Integer.parseInt(value);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
