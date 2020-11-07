package youzheng.algorithm.beakjoon.beakjoon1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class beakjoon_2992 {
	static Set<Integer> set = new HashSet<Integer>();

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num =sc.nextInt();
		int[] arr = toIntArray(num);

		if (isNotExist(arr)) {
			System.out.println(0);
			return;
		} else {
			int[] visit = new int[arr.length];
			dfs(arr, visit, 0, 0);
			int answer = findAnswer(num);
			if(answer== Integer.MAX_VALUE) {
				System.out.println(0);
			}else {
				System.out.println(answer);
			}
		}

	}// main
	
	

	private static int findAnswer(int num) {
		
		Iterator<Integer> iter =set.iterator();
		int answer=Integer.MAX_VALUE;
		while(iter.hasNext()) {
			int getNum = iter.next();
			if(getNum < answer && getNum > num) {
				answer=getNum;
			}
		}
		
		return answer;
	}



	private static void dfs(int[] arr, int[] visit, int r, int num) {

		if (arr.length == r) {
			set.add(num);
			return;
		}

		for (int i = 0; i < arr.length; i++) {

			if (visit[i] == 0) {
				visit[i] = 1;
				dfs(arr, visit, r + 1, combine(num, arr[i]));
				visit[i] = 0;
			}

		}

	}

	private static int combine(int num, int i) {
		return num * 10 + i;
	}

	private static boolean isNotExist(int[] arr) {

		if (arr.length == 1) {
			return false;
		} else if (isSameNum(arr)) {
			return false;
		}

		return false;
	}

	private static boolean isSameNum(int[] arr) {
		int temp = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (temp != arr[i]) {
				return false;
			}
		}
		return true;
	}

	private static int[] toIntArray(int num) {
		String str = String.valueOf(num);
		int[] arr = new int[str.length()];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = str.charAt(i) - '0';
		}

		return arr;
	}

}
