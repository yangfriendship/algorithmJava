package youzheng.algorithm.beakjoon.beakjoon1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class beakjoon_2525 {
	
//	14 30
//	20
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int h = Integer.parseInt(st.nextToken()); //14
		int m = Integer.parseInt(st.nextToken()); //30
		int n = Integer.parseInt(new StringTokenizer(br.readLine()).nextToken()); //20 

		int addH = n/60;
		int addM = n%60;
		
		
		m+=addM;
		h+=addH;
		if(m>=60) {
			h++;
			m-=60;
		}
	
		if(h>=24) {
			h-=24;
		}
		System.out.printf("%d %d",h,m);
		
	}
}
