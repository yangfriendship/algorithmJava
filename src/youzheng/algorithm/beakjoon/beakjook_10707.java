package youzheng.algorithm.beakjoon;

import java.util.Scanner;

public class beakjook_10707 {

//	JOI���� ��� �ִ� �������� X��� Y��, �� ���� ����ȸ�簡 �ִ�. 
//	�� ȸ���� ��������� �� �ް� ������ ��뷮�� ���� ������ ���� ��������.
//	X�� : 1���ʹ� A��.
//	Y�� : �⺻����� B���̰�, ��뷮�� C���� ���϶�� ����� �⺻��ݸ� û���ȴ�.
//	��뷮�� C���Ͱ� �Ѿ��� ��� �⺻��� B���� ���ؼ� �߰������ �ٴ´�. 
//	�߰������ ��뷮�� C���͸� �Ѿ��� ��� 1���͸� �Ѿ��� ������ D���̴�.
//	JOI���� ������ �� �ް� ���� ������ ���� P�����̴�.
//	��������� �ִ��� �ΰ� �ǵ��� ����ȸ�縦 �� ��, JOI���� ���� 1�ް� ��������� ���Ͽ���.
//	ù ��° �ٿ��� X���� 1���ʹ� ��� A�� �Էµȴ�.
//	�� ��° �ٿ��� Y���� �⺻��� B�� �Էµȴ�.
//	�� ��° �ٿ��� Y���� ����� �⺻����� �Ǵ� ��뷮�� ���� C�� �Էµȴ�.
//	�� ��° �ٿ��� Y���� 1���� �� �߰���� D�� �Էµȴ�.
//	�ټ� ��° �ٿ��� JOI���� ������ ����ϴ� �� �ް� ������ �� P�� �Էµȴ�.
//	9
//	100
//	20
//	3
//	10
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int xPrice = sc.nextInt(); //9
		int yPrice = sc.nextInt(); // 100
		int yAdd = sc.nextInt(); //20
		int yAddprice = sc.nextInt(); //3
		int L = sc.nextInt(); //10L
		
		if(xPrice*L <= yPrice ) {
			System.out.println(xPrice*L);
			return;
		}

		int a = L * xPrice;
		int b =0;
		
		if(L<= yAdd) {
			b= yPrice;
		}else {
			int n =0;
			n = L-yAdd;
			b= yPrice + (n * yAddprice);
		}
		System.out.println(Math.min(a, b));
		
		
		
	}
}
