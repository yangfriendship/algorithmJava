package youzheng.algorithm.beakjoon.beakjoon1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class beakjoon_5568 {
	static int[] visit;
	static int[] arr;
	static int k;
	static int n;
	static Set<Integer> set = new HashSet<Integer>();

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();

		n = Integer.parseInt(br.readLine());
		k = Integer.parseInt(br.readLine());
		arr = new int[n];
		visit = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}

		dfs(0, 0, 0);
		System.out.println(set.size());

	}// main

	private static void dfs(int m, int idx, int num) {

		if (m == k) {
			set.add(num);
			return;
		} else if (idx > n) {
			return;
		}
		for (int i = 0; i < arr.length; i++) {

			if (visit[i] == 0) {
				visit[i] = 1;
				dfs(m + 1, i, combine(num, arr[i]));
				visit[i] = 0;
			}

		}

	}// bfs

	static int combine(int a, int b) {

		int cnt = 0;
		int temp = b;
		while (temp != 0) {
			temp /= 10;
			cnt++;
		}
		return a * (int) Math.pow(10, cnt) + b;
	}
}
