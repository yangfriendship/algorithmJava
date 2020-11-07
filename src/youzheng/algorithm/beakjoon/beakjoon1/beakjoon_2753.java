package youzheng.algorithm.beakjoon.beakjoon1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class beakjoon_2753 {
	
//	������ �־����� ��, �����̸� 1, �ƴϸ� 0�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//	������ ������ 4�� ����̸鼭, 100�� ����� �ƴ� �� �Ǵ� 400�� ����� ���̴�.
//	���� ���, 2012���� 4�� ����̸鼭 100�� ����� �ƴ϶� �����̴�. 
//	1900���� 100�� ����̰� 400�� ����� �ƴϱ� ������ ������ �ƴϴ�. 
//	������, 2000���� 400�� ����̱� ������ �����̴�.
//	input 2000 : output : 1or0 
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int year = Integer.parseInt(br.readLine());
		
		if(year%4==0&& year%100!=0  || year%400==0 ) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
		
		
	}
}
