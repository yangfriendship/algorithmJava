package youzheng.algorithm.beakjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class beakjoon_10814 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		String[][] str = new String[num][2];
		for (int i = 0; i < num; i++) {
			str[i][0] = sc.next();
			str[i][1] = sc.next();
		}


		for (int i = 1; i <= 200; i++) {
			int cnt = 0;
			
			while(cnt!=num) {
				
				if(Integer.parseInt(str[cnt][0])==i) {
					System.out.println(str[cnt][0]+" "+str[cnt][1]);
				}
				cnt ++;
			}
			
			
		}
		
		
	
	}
	
}
