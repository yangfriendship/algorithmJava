package youzheng.algorithm.beakjoon.beakjoon1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class beakjoon_14247 {

	static int num = 0;

	static class Tree implements Comparable<Tree> {
		int high;
		int grow;

		@Override
		public int compareTo(Tree o) { // ����ġ�� ����������

			if (this.grow == o.grow) {
				return this.high - o.high;
			} else {
				return this.grow - o.grow;
			}

		}
	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		num = Integer.parseInt(br.readLine());

		Tree[] trees = new Tree[num];
		for (int i = 0; i < trees.length; i++) {
			trees[i] = new Tree();
		}
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		for (int i = 0; i < trees.length; i++) {
			trees[i].high = Integer.parseInt(st1.nextToken());
			trees[i].grow = Integer.parseInt(st2.nextToken());
		}
		Arrays.sort(trees);
		printArr(trees);
		long sum = 0;

		for (int i = 0; i < trees.length; i++) {
			sum += trees[i].high + i * (trees[i].grow);
		}

		System.out.println(sum);
	}// main

	static void printArr(Tree[] trees) {

		for (int i = 0; i < trees.length; i++) {
			System.out.printf("����ġ : %d , �������� : %d, �ִ� ����ġ = %d \n", trees[i].grow, trees[i].high,
					trees[i].high + (trees.length - 1) * (trees[i].grow));
		}

	};

}
