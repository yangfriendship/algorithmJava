package youzheng.algorithm.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class beakjoon_1449 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int l = Integer.parseInt(st.nextToken());
		int[] arr = new int[n];
		int location = 0;
		st = new StringTokenizer(br.readLine());

		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		location = arr[0] - 1;
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {

			int now = arr[i];
			if (now > location) {
				cnt++;
				location = now + l - 1;
			}

		}

		System.out.println(cnt);

	}

}
