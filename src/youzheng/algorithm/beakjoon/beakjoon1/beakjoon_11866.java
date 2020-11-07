package youzheng.algorithm.beakjoon.beakjoon1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class beakjoon_11866 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		Deque<Integer> que = new LinkedList<Integer>();
		for (int i = 0; i < n; i++) {
			que.add(i+1);
		}
		sb.append("<");
		while(!que.isEmpty()) {
			
			for (int i = 0; i < k-1; i++) {
				que.addLast(que.pollFirst());
			}
			sb.append(que.pollFirst());
			if(!que.isEmpty()) {
				sb.append(", ");
			}
		}
		sb.append(">");
		System.out.println(sb);
		
	} // main
	
}
