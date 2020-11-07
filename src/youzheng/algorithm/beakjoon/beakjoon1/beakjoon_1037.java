package youzheng.algorithm.beakjoon.beakjoon1;

import java.io.IOException;
import java.util.Scanner;

public class beakjoon_1037 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int[] list = new int[num];
		for (int i = 0; i < num; i++) {
			list[i] = sc.nextInt();
		}
		
		for (int i = 0; i < list.length-1; i++) {
			int min = i;
			
			for (int j = i+1; j < list.length; j++) {
				
				if (list[j] < list[min]) {
					min = j;
				}
				
			}
			int temp = list[i];
			list[i] = list[min]; 
			list[min] = temp;
		}
		
		int result = (list[0]==1 ? list[1] : list[0]) * list[list.length-1];
		
		System.out.println(result);
	}
	
}
