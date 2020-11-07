package youzheng.algorithm.beakjoon.beakjoon1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class beakjoon_5397 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuffer sb = new StringBuffer();
		while(n-- >0) {
			
			String[] arr = br.readLine().split("");
			Stack<String> left = new Stack<String>();
			Stack<String> right = new Stack<String>();
			
			for (int i = 0; i < arr.length; i++) {
				String input = arr[i];
				
				switch (input) {
				case "<":
					if(!left.isEmpty()) {
						right.add(left.pop());
					}
					break;

				case ">":
					if(!right.isEmpty()) {
						left.add(right.pop());
					}
					break;
				case "-":
					if(!left.isEmpty()) {
						left.pop();
					}
					break;
				default :
					left.add(input);
					break;
				}
			}
			
			for (int i = 0; i < left.size(); i++) {
				sb.append(left.get(i));
			}
			while(!right.isEmpty()) {
				sb.append(right.pop());
			}
			sb.append("\n");
			
		}//while
		System.out.println(sb);
	}//main
}
