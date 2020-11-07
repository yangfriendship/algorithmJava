package youzheng.algorithm.beakjoon.beakjoon1;

import java.util.Scanner;

public class baeckjoon_11047 {

	public static void print(int[] a) {

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] a = new int[n];
		int cnt = 0;
		for (int i = 0; i < n; i++) {

			a[n - 1 - i] = sc.nextInt();
		}

		for (int i = 0; i < a.length; i++) {

			while (k - a[i] >= 0) {
				cnt++;
				k -= a[i];
			}
		}

		System.out.println(cnt);

	}
}
