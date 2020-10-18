package youzheng.algorithm.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class beakjoon_2212 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int k = Integer.parseInt(br.readLine());
		int[] arr = new int[n];

		StringTokenizer st = new StringTokenizer(br.readLine());

		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		int[] sum = new int[n - 1];

		for (int i = 0; i < sum.length; i++) {
			sum[i] = arr[i + 1] - arr[i];
		}
		Arrays.sort(sum);
		int result = 0;
		for (int i = 0; i < n - k; i++) {
			result += sum[i];
		}
		System.out.println(result);
	}
}
