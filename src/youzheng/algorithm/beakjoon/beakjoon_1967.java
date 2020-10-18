package youzheng.algorithm.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class beakjoon_1967 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());

		if (n == k) {
			System.out.println(0);
			return;
		}

		System.out.println(bfs(n, k));
	}

	public static int bfs(int n, int k) {
		Queue<Integer> que = new LinkedList<Integer>();
		int curr = n;
		que.add(curr);
		int[] visit = new int[100001];
		int[] level = new int[100001];
		level[n] = 0;
		int cnt = 0;

		while (!que.isEmpty()) {

			int num = que.poll();
			if (num + 1 < 100001 && num + 1 >= 0 && visit[num + 1] == 0) {
				que.add(num + 1);
				visit[num + 1] = 1;
				level[num + 1] = level[num] + 1;
				if (num + 1 == k) {
					cnt = num + 1;
					break;
				}

			}
			if (num - 1 < 100001 && num - 1 >= 0 && visit[num - 1] == 0) {
				que.add(num - 1);
				visit[num - 1] = 1;
				level[num - 1] = level[num] + 1;
				if (num - 1 == k) {
					cnt = num - 1;
					break;
				}
			}

			if (num * 2 < 100001 && num * 2 >= 0 && visit[num * 2] == 0) {
				que.add(num * 2);
				visit[num * 2] = 1;
				level[num * 2] = level[num] + 1;
				if (num * 2 == k) {
					cnt = num * 2;
					break;
				}
			}

		}
		return level[cnt];
	}
}
