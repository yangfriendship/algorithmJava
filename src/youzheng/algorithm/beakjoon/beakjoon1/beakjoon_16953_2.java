package youzheng.algorithm.beakjoon.beakjoon1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class beakjoon_16953_2 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int cnt =1;
		while(true) {
			
			if(b < a) {
				cnt = -1; break;
			}
			if(a==b) {
				break;
			}

			if(b%10 == 1) {
				b /= 10; cnt ++;
			}else if(b%2 == 0) {
				b /=2; cnt ++;
			}else {
				cnt = -1;
				break;
			}
		}
			System.out.println(cnt);
	}// main
}
