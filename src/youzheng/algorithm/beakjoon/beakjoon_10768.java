package youzheng.algorithm.beakjoon;

import java.util.Scanner;

public class beakjoon_10768 {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//2.18
		int m = sc.nextInt();
		int d = sc.nextInt();
		
		
		if(m==1 || (m==2 && d <18)) {
			System.out.println("Before");
			return;
		}else if(m==2 && d==18) {
			System.out.println("Special");
			return;
		}else {
			System.out.println("After");
			return;
		}
		
		
	}
}
