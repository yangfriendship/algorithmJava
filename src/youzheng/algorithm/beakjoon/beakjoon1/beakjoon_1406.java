package youzheng.algorithm.beakjoon.beakjoon1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;

public class beakjoon_1406 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split("");
		int n = Integer.parseInt(br.readLine());
		int max = 0;
		Stack<String> left = new Stack<String>();
		Arrays.stream(input).forEach(i -> {
			left.add(i);
		});
		Stack<String> right = new Stack<String>();

		while (n-- > 0) {
			String command = br.readLine();

			switch (command) {
			case "L":
				if (!left.isEmpty()) {
					right.push(left.pop());
				}
				break;

			case "D":
				if (!right.isEmpty()) {
					left.add(right.pop());
				}
				break;
			case "B":
				if (!left.isEmpty()) {
					left.pop();
				}
				break;
			default:
				String value = command.substring(2);
				left.add(value);
				break;
			}
		}
		while (!right.isEmpty()) {
			left.add(right.pop());
		}
		String result = (left.toString()).replaceAll("[\\[\\], ]", "");
		System.out.println(result);

	}// main
}
