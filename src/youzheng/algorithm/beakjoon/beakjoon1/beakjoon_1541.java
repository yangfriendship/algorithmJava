package youzheng.algorithm.beakjoon.beakjoon1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class beakjoon_1541 {
	
	public static int add(String input) {
		String[] str = input.split("\\+");
		int result =0;
		
		for(String k : str) {
			result += Integer.parseInt(k);
		}
		return result;
	}

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
		br.close();
		
		String[] list = input.split("\\-");
		
		
		int sum =0;
		sum = Integer.parseInt(list[0]);
		
		for (int i = 1; i < list.length; i++) {
			
			sum -= add(list[i]);
		}
		System.out.println(sum);
	}
	
}

//public static void main(String[] args) throws IOException{
//	
//	
//	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//	
//	String str = br.readLine();
//	
//	str = str.replace("+", " ");
//	str = str.replace("-", " ");
//	int sum= 0;
//	StringTokenizer st = new StringTokenizer(str);
//	String value = st.nextToken();
//	int first = Integer.parseInt(value);
//	sum=0;
//	while(st.hasMoreTokens()) {
//		value = st.nextToken();
//		sum += Integer.parseInt(value);
//		
//	}
//	System.out.println(0-(sum-first));
//}