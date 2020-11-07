package youzheng.algorithm.beakjoon.beakjoon1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class beakjoon_1181 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(br.readLine());
		String[] str = new String[num];
		String[][] result = new String[51][num];
		int[] index = new int[51];
		for (int i = 0; i < num; i++) {
			str[i] = br.readLine();
		}

		Arrays.sort(str);

		for (int i = 0; i < str.length; i++) {
			result[str[i].length()][index[str[i].length()]] = str[i];
			index[str[i].length()]++;
		}
		for (int i = 1; i < index.length; i++) {

			for (int j = 0; j < index[i]; j++) {

				if (j != index[i] - 1) {
					if (result[i][j].equals(result[i][j + 1])) {

					} else {
						System.out.println(result[i][j]);
					}
				} else {
					System.out.println(result[i][j]);
				}

			}
		}

	}//
}
