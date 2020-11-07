package youzheng.algorithm.beakjoon.beakjoon1;

import java.io.IOException;
import java.util.Scanner;

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
