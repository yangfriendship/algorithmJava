package youzheng.algorithm.beakjoon.beakjoon1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class beakjoon_9009 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		while(T-- > 0) {
			int num = Integer.valueOf(br.readLine());
			int value = 0;
			Stack<Integer> stk = new Stack<Integer>();

			stk.add(0);
			stk.add(1);
			StringBuffer sb = new StringBuffer();
			while (true) {

				int curSize = stk.size();
				value = stk.get(curSize - 1) + stk.get(curSize - 2);
				if (value > num) {
					break;
				}
				stk.add(value);
			}
			while (num > 0) {

				int sd = stk.pop();
				if (num - sd >= 0) {
					num -= sd;
					sb.insert(0,sd);
					if(num!=0) {
						sb.insert(0," ");
					}
				}
			}
			System.out.println(sb);
		}

		
	}// main
}
