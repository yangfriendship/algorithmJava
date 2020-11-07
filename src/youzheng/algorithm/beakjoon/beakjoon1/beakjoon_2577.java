package youzheng.algorithm.beakjoon.beakjoon1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class beakjoon_2577 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		
		int result = a*b*c;
		
		int[] list = new int[10];
		int value =0;
		while(result !=0) {
			list[result%10] ++;
			result /=10;
		}
		
		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
		}
	}
	
}
