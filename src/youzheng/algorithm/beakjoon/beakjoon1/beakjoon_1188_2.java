package youzheng.algorithm.beakjoon.beakjoon1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//index = 	x/2+1
public class beakjoon_1188_2 {

	// ��� 5�� , �Ҽ��� 3�����
	// 3/5�� n���ϸ� 3���� �Ǵ°�?
	// �Ҽ��� 2 ��� 6 �� 4
	// 3���� 1���� �������ٴ�
	// 3���� 1 * n = 2

	public static int gcd(int a, int b) {

		if (b == 0) {
			return a;
		} else {

			return gcd(b, a % b);
		}
	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int s = Integer.parseInt(st.nextToken()); // 3
		int num = Integer.parseInt(st.nextToken()); // 2
		int result = 0;

		if (s % num == 0) {
			System.out.println(0);
			return;
		}

		System.out.println(num - gcd(s, num));

	}
}
