package youzheng.algorithm.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class beakjoon_2667 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		int[][] arr = new int[n][n];
		String temp = "";
		for (int i = 0; i < arr.length; i++) {
			temp = br.readLine();
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = temp.charAt(j) - '0';
			}
		} // input
		int cnt = 0;
		List<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr.length; j++) {

				if (arr[i][j] == 1) {
					cnt ++;
					list.add(bfs(arr, i, j));
				}

			}
		}

		Collections.sort(list);

		System.out.println(cnt);
		for(int item : list) {
			System.out.println(item);
		}
	}//

	public static int bfs(int[][] arr, int y, int x) {
		Queue<Integer> queX = new LinkedList<Integer>();
		Queue<Integer> queY = new LinkedList<Integer>();
		queX.add(x);
		queY.add(y);
		int[][] visit = new int[arr.length][arr.length];
		visit[y][x] = 1;

		int result = 0;
		while (!queX.isEmpty() && !queY.isEmpty()) {

			int newX = queX.poll();
			int newY = queY.poll();
			result ++;
			for (int i = 0; i < 4; i++) {

				int[] moveX = { -1, 0, 0, 1 };
				int[] moveY = { 0, 1, -1, 0 };

				if (isRng(arr, (newY + moveY[i]), (newX + moveX[i])) && visit[newY + moveY[i]][newX + moveX[i]] == 0) {
					visit[newY + moveY[i]][newX + moveX[i]] = visit[newY][newX] + 1;
					queY.add(newY + moveY[i]);
					queX.add(newX + moveX[i]);
					arr[newY + moveY[i]][newX + moveX[i]] = 0;
				}

			}

		}
		return result;
	}

	public static boolean isRng(int[][] arr, int y, int x) {

		if (y >= 0 && x >= 0 && y < arr.length && x < arr.length && arr[y][x] == 1) {
			return true;
		}

		return false;
	}

}
