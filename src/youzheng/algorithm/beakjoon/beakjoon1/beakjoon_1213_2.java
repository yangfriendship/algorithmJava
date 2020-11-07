package youzheng.algorithm.beakjoon.beakjoon1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class beakjoon_1213_2 {
	static int evenCnt = 0;
	static String evenStr = "";

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		int[] arr= new int[26];
		
		for (int i = 0; i < str.length(); i++) {
			int index = (str.charAt(i)-65);
			arr[index] = arr[index]+1;
		}

		int evenCnt = 0;
		int evenStr =0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 1 ) {
				evenCnt ++;
				evenStr =i;
			}
		}
		
		StringBuffer sb = new StringBuffer();
		Deque<String> que = new LinkedList<String>();
		if(evenCnt>1) {
			System.out.println("I'm Sorry Hansoo");
			return;
		}else if(evenCnt==1) {
			char evenChar = (char)(evenStr+65);
			que.add(String.valueOf(evenChar));
		}
		
		
		for (int i = arr.length-1; i >=0; i--) {
			
			if(arr[i]!=0) {
				
				String target = String.valueOf((char)(i+65));
				int repeat = arr[i]%2==0 ? arr[i] : arr[i] -1;
				
				while(repeat-- >0) {
					if(repeat%2 ==0) {
						que.addFirst(target);
					}else {
						que.addLast(target);
					}
				}
			}
		}

		while(!que.isEmpty()) {
			sb.append(que.pollFirst());
		}
		
		System.out.println(sb);
		
	}// main
}
