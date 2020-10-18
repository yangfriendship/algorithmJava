package youzheng.algorithm.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.StringTokenizer;

public class beakjoon_2752 {
	
//	14 30
//	20
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] num = new int[3];
		int SIZE = 3;
		StringTokenizer st = new StringTokenizer(br.readLine());
		num[0] = Integer.parseInt(st.nextToken());
		num[1] = Integer.parseInt(st.nextToken());
		num[2] = Integer.parseInt(st.nextToken());
		
		int min = 0;
		
		for (int i = 0; i < SIZE-1; i++) {
			min = i;
			for (int j = i+1; j <SIZE ; j++) {
				if (num[min] > num[j]) {
					min = j;
				}
			}
			int temp = num[min];
			num[min] = num[i];
			num[i] = temp;
		}
		
		for (int i = 0; i < SIZE; i++) {
			System.out.printf("%d ",num[i]);
		}
		
	}
}
