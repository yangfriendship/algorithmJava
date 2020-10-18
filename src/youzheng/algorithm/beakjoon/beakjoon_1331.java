package youzheng.algorithm.beakjoon;

import java.util.Scanner;

public class beakjoon_1331 {

	public static boolean solve(String[] str) {
		
		for (int i = 0; i < str.length; i++) {
			
			for (int j = 0; j < str.length; j++) {
				
				if(str[i].equals(str[j])) {
					return false;
				}
			}
			
		}
		
		int lengt = str.length;
		String target = str[0];
		for (int i = 1; i < str.length; i++) {
			int x = Math.abs(target.charAt(0) - str[i].charAt(0));
			int y = Math.abs(target.charAt(1) - str[i].charAt(1));
			if (x == 2 && y == 1) {
				target = str[i];
			} else if (y == 2 && x == 1) {
				target = str[i];
			} else {
				return false;
			}

		}

		return true;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String[] input = new String[36];
		for (int i = 0; i < 36; i++) {

			input[i] = sc.nextLine();
		}

		boolean result = solve(input);

		if (result) {
			System.out.println("Valid");
		} else {
			System.out.println("Invalid");
		}

	}

}
