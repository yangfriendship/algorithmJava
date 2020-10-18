package youzheng.algorithm.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.StringTokenizer;

public class beakjoon_5575 {
//	 ��ٽð�	��ٽð�
//	H M m H	 M m
//	9 0 0 18 0 0
//	9 0 1 18 0 0
//	12 14 52 12 15 30
	static Scanner sc = new Scanner(System.in);

	public static int[] input() {

		int[] time = new int[6];

		for (int i = 0; i < time.length; i++) {
			time[i] = sc.nextInt();
		}
		return time;
	}

	public static void print(int[] list) {

		for (int i = 0; i < list.length; i++) {
			System.out.print(list[i] + " ");
		}
		System.out.println();
	}
	// 0 1 2 3 4 5
	// 03
	// 14
	// 25
	public static void solve(int[] list) {
		int h =0;
		int m =0;
		int M =0;
		
		M = list[5] - list[2];
		
		if(M<0) {
			m--;
			M = 60 - Math.abs(M);
			}
		m += list[4]-list[1];
		
		if(m<0) {
			h--;
			m = 60 - Math.abs(m);
		}
		
		h += list[3]-list[0];
		
			System.out.printf("%d %d %d" ,h,m,M);
			System.out.println();
		
	}
	
	public static void main(String[] args) throws IOException {

		int[] a = input();
		int[] b = input();
		int[] c = input();
		
		solve(a);
		solve(b);
		solve(c);

		

	}
}
