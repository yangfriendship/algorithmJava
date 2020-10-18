package youzheng.algorithm.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class beakjoon_14720 {

	public static void main(String[] args)throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		int[] input = new int[num];
		int cnt =0;
		int index = 0;
		int shop = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < input.length; i++) {
			input[i] = Integer.parseInt(st.nextToken());
		}
		
		for (int i = 0; i < input.length; i++) {
			
			shop = index%3;
			
			if(shop == input[i]) {
				cnt ++;
				index++;
			}
		}

		System.out.println(cnt);
	}//
}
