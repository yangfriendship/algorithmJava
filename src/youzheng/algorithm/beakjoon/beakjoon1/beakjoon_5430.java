package youzheng.algorithm.beakjoon.beakjoon1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class beakjoon_5430 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {

		int T = Integer.parseInt(br.readLine());
		while (T-- > 0) {

			System.out.println(solve());

		}

	}// main

	public static String solve() throws IOException {

		StringBuffer answer = new StringBuffer();
		String[] commArr = inputComm();
		Deque<Integer> que = inputArr();
		boolean reverseCheck = false;
		StringBuffer sb = new StringBuffer();
		boolean error = false;
		for (int i = 0; i < commArr.length; i++) {

			switch (commArr[i]) {
			case "R":
				if (reverseCheck) {
					reverseCheck = false;
				} else if (!reverseCheck) {
					reverseCheck = true;
				}
				break;

			case "D":
				if (que.isEmpty()) {
					answer.append("error");
					error = true;
					return "error";
				} else {
					if (!reverseCheck) {
						que.pollFirst();
					} else if (reverseCheck) {
						que.pollLast();
					}
				}
				break;
			}

		}
		answer.append(toString(reverseCheck, que));

		return new String(answer);
	}

	private static String toString(boolean reverseCheck, Deque<Integer> que) {
		StringBuffer sb = new StringBuffer();
		if (!reverseCheck) {
			return que.toString().replaceAll(" ", "");
		} else if (reverseCheck) {
			sb.append("[");
			while (!que.isEmpty()) {
				sb.append(que.pollLast());
				if (!que.isEmpty()) {
					sb.append(",");
				}
			}
			sb.append("]");

		}

		return new String(sb);
	}

	public static String[] inputComm() throws IOException {
		return br.readLine().split("");
	}

	public static Deque<Integer> inputArr() throws IOException {

		Deque<Integer> result = new LinkedList<>();
		int n = Integer.parseInt(br.readLine());
		String input = br.readLine().replaceAll("[\\[\\] ]", "");
		String[] strArr = input.split(",");

		for (int i = 0; i < n; i++) {
			result.add(Integer.parseInt(strArr[i]));
		}
		return result;
	}

}
