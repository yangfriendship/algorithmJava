package youzheng.algorithm.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.StringTokenizer;

public class beakjoon_5543 {
//	800 �������
//	700	�ߴ�����
//	900 �ϴ�����
//	198 �ݶ�
//	330 ���̴�
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] buger = new int[3];
		int[] yinliao = new int[2];
		
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		int d = Integer.parseInt(br.readLine());
		int e = Integer.parseInt(br.readLine());
		
		buger[0] = a;
		buger[1] = b;
		buger[2] = c;
		yinliao[0] = d;
		yinliao[1] = e;
		
		int min = 999999999;
		int value = 0;

		for (int i = 0; i < 3; i++) {
			value = 0;
			for (int j = 0; j < 2; j++) {
				value = buger[i] + yinliao[j] - 50;
				if (value < min) {
					min = value;
				}
			}
		}
		System.out.println(min);

	}
}
