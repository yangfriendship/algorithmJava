package youzheng.algorithm.beakjoon.beakjoon1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class beakjoon_1427 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		char[] word = str.toCharArray();
		
		for (int i = 0; i < word.length-1; i++) {
			int min = i;
			for (int j = i+1; j < word.length; j++) {
				
				if (word[min]-'0' < word[j]-'0') {
					min = j;
				}
			}
			char temp = word[min];
			word[min] = word[i];
			word[i] = temp;
			
		}
		
		System.out.println(new String(word));
		
	}
	
}
