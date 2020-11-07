package youzheng.algorithm.beakjoon.beakjoon1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class beakjoon_1269_2 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long cnt = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		
		Set<Integer> set = new HashSet<Integer>();
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			set.add(Integer.parseInt(st.nextToken()));
		}
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < m; i++) {
			int value = Integer.parseInt(st.nextToken());
			if (set.contains(value)) {
				cnt++;
			}
		}
		System.out.println(n - cnt + m - cnt);
	}// main
}
