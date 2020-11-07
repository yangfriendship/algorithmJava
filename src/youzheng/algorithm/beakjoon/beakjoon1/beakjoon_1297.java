package youzheng.algorithm.beakjoon.beakjoon1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//TV�� ũ��
//input : 	52 9 16
//	�밢�� ���� 52  :���� ���� 9 : �ʺ� ���� 16
public class beakjoon_1297 {

	// Math.floor ���� , .ceil �ø� , .round �ݿø�
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());

		int diagonal = Integer.parseInt(st.nextToken()); //52
		int y = Integer.parseInt(st.nextToken());		//9
		int x = Integer.parseInt(st.nextToken());		//16

		double d2 = Math.sqrt(Math.pow(y, 2)+Math.pow(x, 2));
		System.out.println(d2);
		double bili = diagonal % d2 + diagonal / d2;
		System.out.println(bili);
		
	}

}
