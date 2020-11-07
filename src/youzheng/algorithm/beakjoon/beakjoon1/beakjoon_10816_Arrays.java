package youzheng.algorithm.beakjoon.beakjoon1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class beakjoon_10816_Arrays {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num1 = Integer.parseInt(br.readLine());
		int[] arr1 = new int[20000000];
		StringTokenizer st = new StringTokenizer(br.readLine());
		int input = 0;
		for (int i = 0; i < num1; i++) {
			input = Integer.parseInt(st.nextToken());
			if (input >= 0) {
				arr1[input]++;
			} else if (input < 0) {
				arr1[(10000000 + Math.abs(input))]++;
			}

		}

		StringBuilder sb = new StringBuilder();

		int num2 = Integer.parseInt(br.readLine());
		int[] arr2 = new int[num2];

		st = new StringTokenizer(br.readLine());

		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = Integer.parseInt(st.nextToken());
		}
		// �Է� ��, �˻� ����
		int index = 0;
		for (int i = 0; i < arr2.length; i++) {

			index = arr2[i];
			index = index >= 0 ? index : (10000000 + Math.abs(index));
			int value = arr1[index];

			if (value == 0) {
				sb.append(0);
			} else if (value != 0) {
				sb.append(value);
			}
			if (i != arr2.length - 1) {
				sb.append(" ");
			}

		}

		System.out.println(new String(sb));

	}

}
