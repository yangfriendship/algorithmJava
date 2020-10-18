	package youzheng.algorithm.beakjoon;
	
	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;
	import java.util.Arrays;
	import java.util.StringTokenizer;
	import java.util.StringTokenizer;
	
	public class beakjoon_15903 {
	
		public static void main(String[] args) throws IOException {
	
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.valueOf(st.nextToken());
			int m = Integer.valueOf(st.nextToken());
			long[] arr = new long[n];
	
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < arr.length; i++) {
				arr[i] = Integer.valueOf(st.nextToken());
			}
			int cnt = 0;
			while (cnt < m) {
				Arrays.sort(arr);
	
				long sum = arr[0] + arr[1];
				arr[0] = sum;
				arr[1] = sum;
				cnt++;
			}
			long sum = 0;
			for (int i = 0; i < arr.length; i++) {
				sum += arr[i];
			}
	
			System.out.println(sum);
	
		}
	
	}
