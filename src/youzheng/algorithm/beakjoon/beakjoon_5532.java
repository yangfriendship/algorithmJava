package youzheng.algorithm.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.StringTokenizer;

//20 L : �����ϼ�
//25 A : ����
//30 B : ����
//6  C : ���� �Ϸ� ���� ������ ��
//8  D : ���� �Ϸ� ���� ������ ��

public class beakjoon_5532 {
	
	public static int gcd(int a,int b) {
		
		if(b==0) {
			return a;
		}else {
			
			return gcd(b,a%b);
		}
		
	}
							//������ //������������
	public static int solve(int a,int b) {
		int day = 0;
		day = a/b;
		if(a%b!=0) {
			day++;
		}
		
		return day;
	}
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int l = Integer.parseInt(br.readLine());
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		int d = Integer.parseInt(br.readLine());

		int x =  solve(a, c);
		int y =  solve(b, d);

		int result = Math.max(x, y);
		System.out.println(l-result);
		
		
		
	}
}
