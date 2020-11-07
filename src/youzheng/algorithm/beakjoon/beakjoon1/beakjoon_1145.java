package youzheng.algorithm.beakjoon.beakjoon1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class beakjoon_1145 {


	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] input = new int[5];
		int value = 1;
		int min =999999999; 
		int cnt =0;
		for (int i = 0; i < input.length; i++) {
			input[i]= Integer.parseInt(st.nextToken());
		}
		
		while(cnt<3) {
			cnt = 0;
			for (int i = 0; i < input.length; i++) {
				if (value%input[i]==0) {
					cnt++;
				}
			}
			
			if (cnt >=3) {
				break;
			}
			value ++;
		}
		
		System.out.println(value);
		
	}
}
