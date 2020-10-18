package youzheng.algorithm.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class beakjoon_9012 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuffer sb = new StringBuffer();
		while (T-- > 0) {

			String str = br.readLine();
			Stack<Integer> stk = new Stack<Integer>();

			for (int i = 0; i < str.length(); i++) {
				
				int value = str.charAt(i);
				
				if(stk.isEmpty()) {
					stk.add(value);
				}else {
					if(stk.peek() - value == -1 ) {
						stk.pop();
					}else {
						stk.add(value);
					}
				}
				
			}
			
			if(stk.size()==0) {
				sb.append("YES\n");
			}else {
				sb.append("NO\n");
			}
			
		}
		
		System.out.println(sb.delete(sb.length()-1, sb.length()));

	}// main
}
