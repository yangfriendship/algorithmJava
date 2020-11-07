package youzheng.algorithm.beakjoon.beakjoon1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class beakjoon_1927 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		PriorityQueue<Integer> que = new PriorityQueue<Integer>();
		StringBuffer sb = new StringBuffer();
		
		int n = Integer.parseInt(br.readLine());
		
		while(n-- > 0) {
		
			int input = Integer.parseInt(br.readLine());
			if(input == 0) {
				if(!que.isEmpty()) {
					sb.append(que.poll()+"\n");
				}else {
					sb.append(0+"\n");
					
				}
			}else {
				que.add(input);
			}
			
		}
		
		System.out.println(sb);
		
	}//main
}
