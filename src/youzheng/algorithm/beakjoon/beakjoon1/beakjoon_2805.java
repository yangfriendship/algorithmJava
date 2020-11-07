package youzheng.algorithm.beakjoon.beakjoon1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class beakjoon_2805 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[] arr = new int[n];
		st = new StringTokenizer(br.readLine());
		int max = 0;
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());

			if (max < arr[i]) {
				max = arr[i];
			}

		}

		int start = 0;
		int end = max;
		int mid = 0;
		while (start <= end) {

			mid = (start + end) / 2;
			long heigh = cutting(arr, mid);
			if (heigh >= m) {
				start = mid + 1;
			} else if(heigh < m){
				end = mid -1;
			}

		}

		System.out.println(end);

	}

	public static long cutting(int[] arr, int mid) {
		long result = 0;
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i] >= mid) {
				result += arr[i] -mid;
			}
			
		}

		return result;
	}

}
