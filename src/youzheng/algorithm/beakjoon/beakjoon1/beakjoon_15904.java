package youzheng.algorithm.beakjoon.beakjoon1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class beakjoon_15904 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = ((br.readLine()).replaceAll("[^UCP]", ""));

		char[] arr = str.toCharArray();
		char[] check = { 'U', 'C', 'P', 'C' };
		int point = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == check[point]) {
				point++;
			}
			if (point == 4) {
				System.out.println("I love UCPC");
				return;
			}
		}
		System.out.println("I hate UCPC");

	}

}
