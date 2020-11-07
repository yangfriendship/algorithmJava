package youzheng.algorithm.beakjoon.beakjoon1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class beakjoon_10448 {
	// triple 45 = 1035
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(br.readLine());

		int[] arr = new int[num];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}

		int[] tri = new int[45];

		for (int i = 1; i < tri.length; i++) {
			tri[i] = triple(i);
		}
		
		for (int i = 0; i < arr.length; i++) {
			if(solve(tri, arr[i])) {
				System.out.println(1);
			}else {
				System.out.println(0);
			}
		}

	}

	public static boolean solve(int[] tri, int num) {

		for (int i = 1; i < tri.length + 1; i++) {

			for (int j = 1; j < tri.length; j++) {

				for (int j2 = 1; j2 < tri.length; j2++) {

					if (triple(i) + triple(j) + triple(j2) == num) {
						return true;
					}

				}

			}
		}

		return false;
	}

	public static int triple(int n) {
		int cnt = 1;
		int sum = 0;
		while (cnt != n + 1) {
			sum += cnt;
			cnt++;
		}

		return sum;
	}
}
