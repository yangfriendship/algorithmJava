package youzheng.algorithm.beakjoon.beakjoon1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class beakjoon_10546 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int N = (2 * n) - 1;
		Set<String> set = new HashSet<String>();
		while (N-- > 0) {
			String str = br.readLine();

			if (set.contains(str)) {
				set.remove(str);
			} else {
				set.add(str);
			}
		}
		String result = set.toString().replaceAll("[\\[\\]]", "");
		System.out.println(result);

	}// main
}
