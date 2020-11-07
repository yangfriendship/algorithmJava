package youzheng.algorithm.beakjoon.beakjoon1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.StringTokenizer;

public class beakjoon_2468_2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[][] arr = new int[n][n];
		StringTokenizer st = null;
		int input = 0;
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < arr.length; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < arr.length; j++) {
				input = Integer.parseInt(st.nextToken());
				arr[i][j] = input;
				set.add(input);
			}
		} // input

		List<Integer> list = new ArrayList<Integer>(set);
		set.clear();
		list.add(0);
		Collections.sort(list);
		int result = 0;
		for (int i = 0; i < list.size(); i++) {
			int[][] visit = new int[arr.length][arr.length];
			int high = list.get(i);
			int cnt = 0;
			for (int j = 0; j < visit.length; j++) {

				for (int k = 0; k < visit.length; k++) {

					if (arr[j][k] > high && visit[j][k] == 0) {
						bfs(arr, visit, high ,j, k);
						cnt ++;
					}
				}

			}
			if(cnt > result) {
				result = cnt;
			}

		}
		System.out.println(result);

	}

	public static void bfs(int[][] arr, int[][] visit,int high ,int y, int x) {

		Queue<Integer> queX = new LinkedList<Integer>();
		queX.add(x);
		Queue<Integer> queY = new LinkedList<Integer>();
		queY.add(y);
		visit[y][x] = 1;
		int rng = arr.length;
		while (!queX.isEmpty() && !queY.isEmpty()) {
			int qx = queX.poll();
			int qy = queY.poll();
			int[] moveX = { 1, -1, 0, 0 };
			int[] moveY = { 0, 0, 1, -1 };
			for (int i = 0; i < 4; i++) {
				int addX = qx + moveX[i];
				int addY = qy + moveY[i];

				if (isRng(arr, rng,high ,addY, addX) && visit[addY][addX] == 0) {
					visit[addY][addX] = visit[qy][qx];
					queY.add(addY);
					queX.add(addX);

				}
			}

		}

	}

	public static boolean isRng(int[][] arr, int rng,int high ,int addY, int addX) {

		if (addX >= 0 && addY >= 0 && addX < rng && addY < rng && arr[addY][addX] > high) {
			return true;
		}

		return false;
	}

}
