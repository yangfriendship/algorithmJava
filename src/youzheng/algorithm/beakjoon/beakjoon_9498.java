package youzheng.algorithm.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class beakjoon_9498 {


	public static void main(String[] args) throws NumberFormatException, IOException {

		
		Scanner sc = new Scanner(System.in);
		int[] score = new int[5];
		
		for (int i = 0; i < 5; i++) {
			score[i] = sc.nextInt();
		}
		int sum=0;
		for (int j = 0; j < score.length; j++) {
			
			if(score[j]<40) {
				sum+=40;
			}else {
				sum+=score[j];
			}
			
		}
		System.out.println(sum/5);
	}
}
