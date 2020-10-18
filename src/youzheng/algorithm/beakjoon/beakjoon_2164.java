package youzheng.algorithm.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class beakjoon_2164 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Queue<Integer> que = new LinkedList<Integer>();
		
		int n = Integer.parseInt(br.readLine());
		br.close();
		for (int i = 0; i < n ; i++) {
			que.add(i+1);
		}
		while(que.size()>1) {
			
			if(que.size()>1) {
				que.poll();
				if(que.size()>1) {
					que.add(que.poll());
				}
			}
			
		}
		System.out.println(que.poll());
	}//main
}
