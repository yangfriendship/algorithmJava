package youzheng.algorithm.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class beakjoon_1038 {
	static int n ;
	static List<Integer> list = new LinkedList<>();
	static int danwei = 10;
	static int maxLength;
	static int cnt = 0;
	static int answer = 0;
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		if(n == 1022){
			System.out.println("9876543210");
			return;
		}else if(n < 10){
			System.out.println(n);
			return;
		}else if(n>1022){
			System.out.println(-1);
			return;
		}
		int[] arr = new int[10];
		int r = 0;
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}

		for (int i = 0; i < 9; i++) {
			maxLength = String.valueOf((int)danwei*(int)Math.pow(10,i)).length();

			bfs(arr,10,r,0);

		}



		System.out.println(answer);

	}

	private static void bfs(int[] arr,int start, int r, int sum) {

		if (r == maxLength && (String.valueOf(sum).length()) == maxLength) {
			list.add(sum);
			if(list.size()== n+1){
				answer = sum;
			}
			return;
		}

		for (int i = 0; i < arr.length; i++) {
			if(i< start){
				int value = (sum*10) + i;
				bfs(arr,i,r+1,value);
			}
		}


	}


}
