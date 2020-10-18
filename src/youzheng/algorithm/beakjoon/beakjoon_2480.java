package youzheng.algorithm.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.StringTokenizer;

public class beakjoon_2480 {
//	���� ���� 3���� ������ 10,000��+(���� ��)*1,000���� ����� �ް� �ȴ�. 
//	���� ���� 2���� ������ ��쿡�� 1,000��+(���� ��)*100���� ����� �ް� �ȴ�. 
//	��� �ٸ� ���� ������ ��쿡�� (�� �� ���� ū ��)*100���� ����� �ް� �ȴ�.  
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int result;
		if(a==b&&b==c) {
			result = 10000 + (a*1000);
		}else if(a!=b&&b!=c&&c!=a) {
			result = Math.max(a, Math.max(b, c)) * 100;
		}else {
			int temp = (a-b==0)? a : c;
			result =1000+ temp * 100;
		}
		
		System.out.println(result);
	}
}
