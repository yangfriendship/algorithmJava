package youzheng.algorithm.beakjoon;

import java.io.IOException;
import java.util.Scanner;

public class beakjoon_1712 {
//�������
//�����
//����
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int result = 0;
		if(B>=C) {
			result = -1;
		}
		else {
			result = (A/(C-B)+1);
		}
		System.out.println(result);
	}
		
	}

