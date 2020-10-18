package youzheng.algorithm.basic;

import java.util.HashSet;
import java.util.Set;

public class Permutaion {
	static int[] arr = new int[4];
	static int r = 2;
	static int[] visit = new int[arr.length];
	static Set<Integer> set = new HashSet<Integer>();
	

	public static void main(String[] args) {
		
		arr = new int[]{1,2,12,1};
		dfs(0, 0, 0);
		
		System.out.println(set.size());
		System.out.println(set);
		
	}//main

	private static void dfs(int m,int idx, int num) {

		if(m == r) {
			set.add(num);
			System.out.println(num);
			return;
		}else if(idx > r) {
			return;
		}
		for (int i = 0 ; i < arr.length ; i++) {
			
			if(visit[i]==0) {
				visit[i]= 1;
				dfs(m+1,i, combine(num, arr[i]));
				visit[i]= 0;
			}
			
		}
		
	}//bfs
	
	static int combine(int a, int b) {
		
		int cnt = 0;
		int temp = b;
		while(temp != 0 ) {
			temp /= 10;
			cnt ++;
		}
		return a * (int)Math.pow(10, cnt) + b;
	}
}
