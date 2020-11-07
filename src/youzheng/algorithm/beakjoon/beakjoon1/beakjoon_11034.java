package youzheng.algorithm.beakjoon.beakjoon1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class beakjoon_11034 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = null;
		StringTokenizer st ;

		while((str= br.readLine()) !=null && str.length()!=0) {
			
			st = new StringTokenizer(str);
			int l = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			int r = Integer.parseInt(st.nextToken());
			int staticNumber = m - l > r - m ? l : r;
			if (staticNumber > m) {
				System.out.println(staticNumber - m - 1);
			} else if (m > staticNumber) {
				System.out.println(m - staticNumber - 1);
			}
			
		}
		

	}

}
