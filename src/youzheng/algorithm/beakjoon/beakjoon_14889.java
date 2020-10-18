package youzheng.algorithm.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class beakjoon_14889 {
	static List<List<Integer>> list = new ArrayList<>();
	static List<List<Integer>> oppt = new ArrayList<>();
	static int min = Integer.MAX_VALUE;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[][] power = new int[n + 1][n + 1];
		StringTokenizer st = null;

		for (int i = 1; i < power.length; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 1; j < power.length; j++) {
				power[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		int[] arr = new int[n + 1];
		for (int i = 1; i < arr.length; i++) {
			arr[i] = i;
		}

		boolean[] visited = new boolean[n + 1];

		combination(arr, visited, 1, arr.length, n / 2);

		for (int i = 0; i < list.size(); i++) {
			int teamA = 0;
			int teamB = 0;

			for (int j = 0; j < list.get(i).size() - 1; j++) {

				for (int k = j + 1; k < list.get(i).size(); k++) {
					int a = list.get(i).get(j);
					int b = list.get(i).get(k);
					int c = oppt.get(i).get(j);
					int d = oppt.get(i).get(k);

					teamA += power[a][b] + power[b][a];
					teamB += power[c][d] + power[d][c];
				}
			}
			min = Math.abs(teamA - teamB) < min ? Math.abs(teamA - teamB) : min;

		}
		System.out.println(min);

	}// main

	static void combination(int[] arr, boolean[] visited, int start, int n, int r) {
		if (r == 0) {
			toIntList(arr, visited, n);
			return;
		}

		for (int i = start; i < n; i++) {
			visited[i] = true;
			combination(arr, visited, i + 1, n, r - 1);
			visited[i] = false;
		}
	}

	// �迭 ���
	static void print(List<List<Integer>> list, List<List<Integer>> oppt) {

		for (int i = 0; i < list.size(); i++) {

			for (int j = 0; j < list.get(i).size(); j++) {
				System.out.print(list.get(i).get(j) + " ");
			}
			System.out.print(" : ");
			for (int j = 0; j < list.get(i).size(); j++) {
				System.out.print(oppt.get(i).get(j) + " ");
			}
			System.out.println();
		}

	}

	static void toIntList(int[] arr, boolean[] visit, int n) {
		List<Integer> result = new ArrayList<Integer>();
		List<Integer> result2 = new ArrayList<Integer>();
		for (int i = 1; i < visit.length; i++) {
			if (visit[i]) {
				result.add(arr[i]);
			} else if (!visit[i]) {
				result2.add(arr[i]);
			}
		}
		list.add(result);
		oppt.add(result2);
	}

}
