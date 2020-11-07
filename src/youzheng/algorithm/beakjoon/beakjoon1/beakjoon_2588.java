package youzheng.algorithm.beakjoon.beakjoon1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class beakjoon_2588 {
	
//	14 30
//	20
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a = Integer.parseInt(br.readLine()); //472
		int b = Integer.parseInt(br.readLine()); //385
		int tempB = b;
		int[] c = new int[3];
		for (int i = 0; i < 3; i++) {
			c[i] = b%10;
			b /=10;
		}

		for (int i = 0; i < c.length; i++) {
			
			System.out.println(a*c[i]);
		}
		System.out.println(tempB*a);
		
		
		
		

		
	}
}
