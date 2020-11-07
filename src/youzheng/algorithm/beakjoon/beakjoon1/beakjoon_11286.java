package youzheng.algorithm.beakjoon.beakjoon1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

class value {
	
	int v;
	int abs;
	public value(int v) {
		this.v = v;
		this.abs = Math.abs(this.v);
	}
	
}

public class beakjoon_11286 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		StringBuffer sb = new StringBuffer();
		
		PriorityQueue<value> que = new PriorityQueue<value>(new Comparator<value>() {

			@Override
			public int compare(value o1, value o2) {
				
				if(o1.abs == o2.abs) {
					return o1.v - o2.v;
				}
				
				return o1.abs - o2.abs;
			}
		});
		
		while(n-- > 0 ) {
			
			int input =Integer.parseInt(br.readLine());
			
			if(input == 0) {
				if(que.isEmpty()) {
					sb.append(0+"\n");
				}else {
					sb.append(que.poll().v+"\n");
				}
			}else {//�����϶�
				value v=new value(input);
				que.add(v);
			}
			
			
			
		}
		System.out.println(sb);
	}//main
}
