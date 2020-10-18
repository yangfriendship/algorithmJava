package youzheng.algorithm.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class beakjoon_2161 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		Queue<Integer> deck = new LinkedList<Integer>();
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < n; i++) {
			deck.add(i+1);
		}

		while(!deck.isEmpty()) {

			sb.append(deck.poll());
			if(!deck.isEmpty()) {
				deck.add(deck.poll());
				sb.append(" ");
			}
			
		}
		System.out.println(sb);
	}// main
}
