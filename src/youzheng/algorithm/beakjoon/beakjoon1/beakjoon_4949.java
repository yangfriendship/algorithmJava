package youzheng.algorithm.beakjoon.beakjoon1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class beakjoon_4949 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = 0;
		int cnt = 0;
		StringBuffer sb = new StringBuffer();
		
		while(true) {
			String str = br.readLine();
			if(str.length()==1 && str.equals(".")) {
				break;
			}
			str= str.replaceAll("[^\\(\\)\\[\\]]", "");
			Deque<Integer> que = new LinkedList<Integer>();
			for (int i = 0; i < str.length(); i++) {
				int value = str.charAt(i);
				if (que.isEmpty()) {
					que.addFirst(value);
				} else {
					if (que.peekLast() - value == -1 || que.peekLast() - value == -2) {
						que.pollLast();
					} else if (que.peekLast() - value != -1 || que.peekLast() - value != -1) {
						que.addLast(value);
					}
				}

			}
			if (que.size() == 0) {
				sb.append("yes\n");
			}else {
				sb.append("no\n");
			}
		}
		
		System.out.println(sb);
	}
}
