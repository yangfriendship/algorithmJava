package youzheng.algorithm.beakjoon;

import java.io.IOException;
import java.util.Scanner;

public class beakjoon_10797 {

	
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		
		int day = sc.nextInt(); //1
		
		int[] cars = new int[5];
		int cnt =0;
		
		for (int i = 0; i < cars.length; i++) {
			cars[i] = sc.nextInt();
			if(cars[i]== day) {
				cnt++;
		}
			
		}
		System.out.println(cnt);
	}
}
