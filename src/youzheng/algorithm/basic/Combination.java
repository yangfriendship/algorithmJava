package youzheng.algorithm.basic;

import java.util.ArrayList;
import java.util.List;

public class Combination {
	static List<List<Integer>> list = new ArrayList<>();
	static List<List<Integer>> oppt = new ArrayList<>();

	public static void main(String[] args) {
		int n = 4;
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
		boolean[] visited = new boolean[arr.length];
		combination(arr, visited, 0, arr.length, 4);
		System.out.println(list.size());
		print(list, oppt);

	}

	// ��Ʈ��ŷ ���
	// ��� ���� : combination(arr, visited, 0, n, r)
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
		for (int i = 0; i < visit.length; i++) {
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