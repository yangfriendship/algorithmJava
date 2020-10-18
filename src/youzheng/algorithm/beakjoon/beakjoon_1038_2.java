package youzheng.algorithm.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class beakjoon_1038_2 {
	static int cnt = 0;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		long num = Long.parseLong(br.readLine());

//		if (num >= 1022) {
//			System.out.println(-1);
//			return;
//		}

		long[] result = new long[2000];
		int index = 0;
		long xiba = 0;

		while (xiba <= num) {

			int m = findM(xiba);

			if (solve(xiba, m)) {
				result[index] = xiba;
				System.out.println(index + " : " + result[index]);
				index++;
			}

			xiba++;
		}

	}

	public static boolean solve(long n, int m) {
		long temp = 0;
		if (n / 10 == 0 && m == 0) {
			return true;
		} else if (n == 0 && m != 0) {
			return false;
		} else {
			temp = (long) (n / Math.pow(10, m - 1));
			if (temp / 10 > temp % 10) {
				long nextValue = (long) (n % (Math.pow(10, m)));
				m = m - 1;
				if (solve(nextValue, m)) {
					return true;
				} else {
					return false;
				}
			} else {
				return false;
			}
		}
	}

	public static int findM(long i) {
		int cnt = 0;
		while (i / 10 != 0) {
			cnt++;
			i /= 10;
		}

		return cnt;
	}
}
