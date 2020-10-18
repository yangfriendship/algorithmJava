package youzheng.algorithm.beakjoon;

import java.io.IOException;
import java.util.Scanner;

public class beakjook_1212 {
	public static void main(String[] args) throws IOException {

//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//		StringTokenizer st = new StringTokenizer(br.readLine());

//		int n = Integer.parseInt(st.nextToken()); // 314
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
//		br.close();
		String[] result = new String[333335];
		int cnt = 0;

		if (n == 0) {
			System.out.println(n);
			return;
		}

		int[] temp = new int[333335];

		while (n != 0) {

			temp[cnt] = n % 10;
			n /= 10;

			cnt++;
		}

		String[] list = { "000", "001", "010", "011", "100", "101", "110", "111", "1000" };

		for (int i = cnt - 1; i >= 0; i--) {
			result[cnt - i - 1] = list[temp[i]];

		}
		int start = (char) (result[0].charAt(0));
		for (int i = 0; i < cnt; i++) {

			if (i == 0 && start == 48) {
				System.out.printf("%s", result[i].substring(1));
			} else {
				System.out.printf("%s", result[i]);
			}

		}

	}

}
