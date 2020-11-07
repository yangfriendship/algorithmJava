package youzheng.algorithm.beakjoon.beakjoon1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class beakjoon_2812_2 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());

		char[] arr = (br.readLine()).toCharArray();
		
		Deque<Integer> que = new LinkedList<Integer>();
		int curr = 0;
		int length = n - k;
		while(que.size() < n - k) {
			int value = arr[curr] - '0';

			if(que.isEmpty()) {
				que.add(value);
				curr ++;
			}else {
				
				if(value >que.peekLast()) {
					que.pollLast();
					que.addLast(value);
					curr ++;
				}else if(value <= que.peekLast()) {
					que.addLast(value);
					curr ++;
				}
				
			}
			
			
		}
		System.out.println(que);
	}// main
}
