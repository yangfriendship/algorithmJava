package youzheng.algorithm.beakjoon.beakjoon1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class beakjoon_2468 {

	static int cnt = 0;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[][] arr = new int[n][n];
		StringTokenizer st = null;
		int max = 0;
		int input = 0;
		for (int i = 0; i < arr.length; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < arr.length; j++) {
				input = Integer.parseInt(st.nextToken());
				arr[i][j] = input;
				if (input > max) {
					max = input;
				}

			}
		}
		int cnt = 0;
		int result = 0;
		for (int k = 0; k <= max; k++) {
			int num = k;
			int[][] tempArr = copyArray(arr);
			cnt = 0;
			for (int i = 0; i < arr.length; i++) {

				for (int j = 0; j < arr.length; j++) {

					if (tempArr[i][j] > num) {
						bfs(tempArr, num, i, j);
						cnt++;
					}
				}
				if (result < cnt) {
					result = cnt;
				}
			}
			tempArr = null;
		}

		System.out.println(result);
	}//

	public static void bfs(int[][] tempArr, int n, int y, int x) {

		Queue<Integer> queX = new LinkedList<Integer>();
		Queue<Integer> queY = new LinkedList<Integer>();
		int[][] visit = new int[tempArr.length][tempArr.length];
		queY.add(y);
		queX.add(x);

		while (!queX.isEmpty() && !queY.isEmpty()) {

			int getY = queY.poll();
			int getX = queX.poll();
			visit[getY][getX] = 1;
			tempArr[getY][getX] = 0;
			for (int i = 0; i < 4; i++) {

				int[] moveY = { 1, 0, 0, -1 };
				int[] moveX = { 0, 1, -1, 0 };
				int addX = getX + moveX[i];
				int addY = getY + moveY[i];
				if (isRng(tempArr, n, addY, addX) && visit[addY][addX] == 0) {
					queY.add(addY);
					queX.add(addX);
					tempArr[getY][getX] = 0;
				}

			}

		}
		queX.clear();
		queY.clear();
	}

	public static boolean isRng(int[][] tempArr, int n, int y, int x) {

		if (x >= 0 && y >= 0 && x < tempArr.length && y < tempArr.length && tempArr[y][x] > n) {
			return true;
		}

		return false;
	}

	public static void print(int[][] tempArr) {

		for (int i = 0; i < tempArr.length; i++) {
			for (int j = 0; j < tempArr.length; j++) {
				System.out.printf("%d ", tempArr[i][j]);
			}
			System.out.println();
		}

	}

	public static int[][] copyArray(int[][] arr) {
		int[][] copy = new int[arr.length][arr.length];

		for (int i = 0; i < copy.length; i++) {
			for (int j = 0; j < copy.length; j++) {
				copy[i][j] = arr[i][j];
			}
		}

		return copy;
	}

}
