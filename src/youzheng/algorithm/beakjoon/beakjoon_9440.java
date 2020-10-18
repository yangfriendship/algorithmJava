package youzheng.algorithm.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;
import java.util.StringTokenizer;

public class beakjoon_9440 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;

		while (true) {
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			if (n == 0) {
				return;
			}
			List<Integer> list = new ArrayList<Integer>();
			Stack<Integer> zero = new Stack<Integer>();

			while (st.hasMoreTokens()) {
				int num = Integer.parseInt(st.nextToken());
				if (num == 0) {
					zero.add(num);
				} else {
					list.add(num);
				}
			}
			Collections.sort(list);
			StringBuilder a = new StringBuilder();
			StringBuilder b = new StringBuilder();

			for (int i = 0; i < list.size(); i++) {
				int num = list.get(i);
				if (i % 2 == 0) {
					a.append(num);
				} else {
					b.append(num);
				}
			}

			while (!zero.isEmpty()) {

				if (b.length() < a.length()) {
					b.insert(1, zero.pop());
				} else {
					a.insert(1, zero.pop());
				}

			}

			System.out.println(Integer.parseInt(new String(a)) + Integer.parseInt(new String(b)));

		}

	}
}
