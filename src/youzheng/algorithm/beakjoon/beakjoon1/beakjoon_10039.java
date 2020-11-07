package youzheng.algorithm.beakjoon.beakjoon1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class beakjoon_10039 {

//	����
//	���� ������ �Է¹޾� 90 ~ 100���� A, 80 ~ 89���� B, 70 ~ 79���� C, 60 ~ 69���� D, 
//	������ ������ F�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//	�Է�
//	ù° �ٿ� ���� ������ �־�����. ���� ������ 0���� ũ�ų� ����, 100���� �۰ų� ���� �����̴�.
//	���
//	���� ������ ����Ѵ�.

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		if (n>=90) {
			System.out.println("A");
		}else if(n>=80) {
			System.out.println("B");
		}else if(n>=70) {
			System.out.println("C");
		}else if(n>=60) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
	}
}
