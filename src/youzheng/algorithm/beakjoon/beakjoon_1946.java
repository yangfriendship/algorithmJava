package youzheng.algorithm.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class beakjoon_1946 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuffer sb = new StringBuffer();

		while (T-- > 0) {
			int num = Integer.parseInt(br.readLine());
			StringTokenizer st = null;
			int[][] arr = new int[num][2];

			for (int i = 0; i < arr.length; i++) {
				st = new StringTokenizer(br.readLine());
				arr[i][0] = Integer.parseInt(st.nextToken());
				arr[i][1] = Integer.parseInt(st.nextToken());
			}
			Arrays.sort(arr, new Comparator<int[]>() {
				@Override
				public int compare(int[] o1, int[] o2) {
					return o1[0] - o2[0];
				}
			});
			int cnt = num;
			int max = arr[0][1];

			for (int i = 1; i < arr.length; i++) {

				if (arr[i][1] > max) {
					cnt--;
				} else if (arr[i][1] < max) {
					max = arr[i][1];
				}
			}
			sb.append(cnt);

			if (T >= 1) {
				sb.append("\n");
			}
		}
		System.out.println(sb);

	}// main
}
