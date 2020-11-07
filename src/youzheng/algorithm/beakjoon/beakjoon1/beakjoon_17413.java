package youzheng.algorithm.beakjoon.beakjoon1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class beakjoon_17413 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int point = 0;
		int start = 0;
		boolean onoff = false;
		StringBuilder sb = new StringBuilder();
		while(point < str.length()) {
			
			char target = str.charAt(point);
			
			if(target!='>'&&point == str.length()-1) {
				sb.append(reserve(str.substring(start)));
				break;
			}
			
			if(target=='<') {
				
				sb.append(reserve(str.substring(start,point)));
				start = point;
				point ++;
			}else if(target!='<' && target!='>') {
				point ++;
			}else if(target=='>' ) {
				sb.append(str.substring(start,point+1));
				point ++;
				start = point;
			}
			
			
		}
		System.out.println(new String(sb));
	
	}

	public static String reserve1(String str) {

		char temp;
		char[] c = str.toCharArray();
		int lastIndex = (str.length() / 2);
		for (int i = 0; i < lastIndex; i++) {
			temp = c[i];
			c[i] = c[c.length - 1 - i];
			c[c.length - 1 - i] = temp;
		}
		return new String(c);
	}
	public static String reserve(String str) {
		
		String[] list = str.split(" ");
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < list.length; i++) {
			sb.append(reserve1(list[i]));
			if(i<list.length-1) {
				sb.append(" ");
			}
		}
		return new String(sb);
	}

}
