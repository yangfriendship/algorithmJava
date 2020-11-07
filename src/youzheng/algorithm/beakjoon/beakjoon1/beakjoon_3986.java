package youzheng.algorithm.beakjoon.beakjoon1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class beakjoon_3986 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int cnt = 0;
		
		while (T-- > 0) {
			char[] arr = br.readLine().toCharArray();
			Deque<Integer> que = new LinkedList<Integer>();

				for (int i = 0; i < arr.length; i++) {

					if (que.isEmpty()) {
						que.addLast(arr[i] - 'A');
					} else { // que is not null

						int value = arr[i] - 'A';
						if (value == que.peekLast()) {
							que.pollLast();
						} else if (value != que.peekLast()) {
							que.addLast(value);
						}

					}
				}
				if (que.size() == 0) {
					cnt++;
				}
			}
			
			

		System.out.println(cnt);

	}// main
}
