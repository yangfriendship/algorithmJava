package youzheng.algorithm.beakjoon.beakjoon1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class beakjoon_1213 {
	static Set<String> set = new HashSet<String>();
	static int[] visit;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] arr = br.readLine().split("");
		visit = new int[arr.length];
		dfs(arr, "", 0);

		if (set.isEmpty()) {
			System.out.println("I'm Sorry Hansoo");
			return;
		}

		List<String> list = new ArrayList<String>(set);
		Collections.sort(list);
		System.out.println(list.get(0));

	}// main

	public static void dfs(String[] arr, String str, int idx) {

		if (idx == arr.length) {
			if (checkValid(str)) {
				set.add(str);
				return;
			}
		}

		for (int i = 0; i < arr.length; i++) {

			if (visit[i] == 0) {
				visit[i] = 1;
				dfs(arr, str + arr[i], idx + 1);
				visit[i] = 0;
			}
		}

	}

	public static boolean checkValid(String str) {

		for (int i = 0; i < str.length() / 2; i++) {
			if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
				return false;
			}
		}
		return true;

	}

}
