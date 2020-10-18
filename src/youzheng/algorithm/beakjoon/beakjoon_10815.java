package youzheng.algorithm.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class beakjoon_10815 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num1 = Integer.parseInt(br.readLine());

		Set<Integer> set = new HashSet<Integer>();

		StringTokenizer st = new StringTokenizer(br.readLine());

		for (int i = 0; i < num1; i++) {
			set.add(Integer.parseInt(st.nextToken()));
		}

		int num2 = Integer.parseInt(br.readLine());

		st = new StringTokenizer(br.readLine());
		int[] arr = new int[num2];
		for (int i = 0; i < num2; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		int size = set.size();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < arr.length; i++) {

			set.add(arr[i]);

			if (set.size() == size) {
				sb.append("1");
			} else if (set.size() != size) {
				sb.append("0");
				size++;
			}
			if (i != arr.length - 1) {
				sb.append(" ");
			}
		}

		System.out.println(new String(sb));

	}

}
