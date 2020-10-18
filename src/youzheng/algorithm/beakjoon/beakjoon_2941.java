package youzheng.algorithm.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class beakjoon_2941 {

	public static void main(String[] args) throws IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		String[] croa = {"c=","c-","dz=","d-","lj","nj","s=","z="};
		int cnt =0;
		char[] word = str.toCharArray();
		
		for (int i = 0; i < croa.length; i++) {
			str=str.replaceAll(croa[i], "!");
		}
		System.out.println(str.length());
		
		
	}
}
