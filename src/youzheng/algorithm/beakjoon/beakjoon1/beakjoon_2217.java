package youzheng.algorithm.beakjoon.beakjoon1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class beakjoon_2217 {

	
	public static void main(String[] args)throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		int[] input = new int[num];
		int max = 0;
		StringTokenizer st ;
		for (int i = 0; i < input.length; i++) {
			st = new StringTokenizer(br.readLine());
			input[i] = Integer.parseInt(st.nextToken());
		}
		int min = 0;
		for (int i = 0; i < input.length-1; i++) {
			min = i;
			for (int j = i+1; j < input.length; j++) {
				
				if(input[min]<input[j]) {
					min = j;
				}
			}
			int temp = input[min];
			input[min] = input[i];
			input[i] = temp;
		}

		for (int i = 0; i < input.length; i++) {
			
			if(input[i] * (i+1)> min) {
				min =input[i] * (i+1);
			}
		}
		System.out.println(min);
			
		
	}//
}
