package youzheng.algorithm.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class beakjoon_1021 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int[] arr = new int[k];
		Deque<Integer> que = new LinkedList<Integer>();
		st = new StringTokenizer(br.readLine());

		for (int i = 1; i <= n; i++) {
			que.add(i);
		}

		for (int i = 0; i < k; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		int cnt = 0;
		int index = 0;
		while (index < k) {
			int target = arr[index];
			if (que.peekFirst() == target) {
				que.pollFirst();
				index++;
			} else {

				int queIndex = findQueIdx(que, target);
				if (queIndex <= que.size() / 2) {

					while (queIndex-- > 0) {
						que.addLast(que.pollFirst());
						cnt++;
						if (que.peekFirst() == target) {
							break;
						}
					}
				} else if (queIndex > que.size() / 2) {
					while (queIndex-- > 0) {
						que.addFirst(que.pollLast());
						cnt++;
						if (que.peekFirst() == target) {
							break;
						}
					}
				}

			}

		}
		System.out.println(cnt);

	}// main

	static int findQueIdx(Deque<Integer> que, int target) {
		int index = 0;
		Iterator<Integer> iter = que.iterator();

		while (iter.hasNext()) {
			if (iter.next() == target) {
				return index;
			}
			index++;
		}

		return index;
	}
}
