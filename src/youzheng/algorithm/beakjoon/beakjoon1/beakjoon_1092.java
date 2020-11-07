package youzheng.algorithm.beakjoon.beakjoon1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class beakjoon_1092 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.valueOf(br.readLine());
		int[] arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int m = Integer.parseInt(br.readLine());
		int[] box = new int[m];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < m; i++) {
			box[i] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(arr);
		Arrays.sort(box);

		int cnt = 0;
		int curr = box.length - 1;
		if (arr[arr.length - 1] < box[box.length - 1]) { // ��ü�� üũ
			System.out.println(-1);
			return;
		}

		while (curr > -1) {
			for (int i = arr.length - 1; i >= 0; i--) {
				if (curr > -1) {
					int pow = arr[i];
					int weight = box[curr];
					if (arr[i] >= box[curr]) {
						curr--;
					} else {
						break;
					}
				} else {
					break;
				}
			}
			cnt++;
		}

		System.out.println(cnt);
	}
}
