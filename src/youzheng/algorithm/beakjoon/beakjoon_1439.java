package youzheng.algorithm.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class beakjoon_1439 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		char[] arr = (br.readLine()).toCharArray();
		int cnt = 0;
		char temp = '2';
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != temp) {
				cnt++;
				temp = arr[i];
			}
		}
		System.out.println(cnt / 2);

	}
}
