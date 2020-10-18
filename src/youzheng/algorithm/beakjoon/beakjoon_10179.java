package youzheng.algorithm.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.StringTokenizer;

public class beakjoon_10179 {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		while (n != 0) {

			double x = sc.nextDouble();

			x = x / 10 * 8;
			System.out.println(String.format("$%.2f", x));

			n--;
		}

	}
}
