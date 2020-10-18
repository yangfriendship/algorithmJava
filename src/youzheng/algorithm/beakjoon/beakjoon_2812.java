package youzheng.algorithm.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class beakjoon_2812 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		char[] arr = (br.readLine().replaceAll(" ", "")).toCharArray();
		int start = 0;
		StringBuffer sb = new StringBuffer();
		Deque<Integer> que = new LinkedList<Integer>();
		int rng = n - (n - k);
		for (int i = 0; i < n - k; i++) {
			for (int j = start; j < rng + i + 1; j++) {
				int value = arr[j] - '0';
				if(que.isEmpty()) {
					que.addLast(value);
				}else {
					if (que.peekLast() < value) {
						que.pollLast();
						que.addLast(value);
						start = j + 1;
					}else if(que.peekLast()>= value) {
						que.addLast(value);
					}
				}
			}
		}
		System.out.println(que);

	}// main
}
