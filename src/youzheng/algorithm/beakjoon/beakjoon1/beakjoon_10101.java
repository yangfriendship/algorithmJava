package youzheng.algorithm.beakjoon.beakjoon1;

import java.util.Scanner;

public class beakjoon_10101 {
//	�� ���� ũ�Ⱑ ��� 60�̸�, Equilateral
//	�� ���� ���� 180�̰�, �� ���� ���� ��쿡�� Isosceles
//	�� ���� ���� 180�̰�, ���� ���� ���� ��쿡�� Scalene
//	�� ���� ���� 180�� �ƴ� ��쿡�� Error

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		if (a + b + c != 180) {
			System.out.println("Error");
		} else if (a == 60 && a == b ) {
			System.out.println("Equilateral");
		} else if(a!=b&&b!=c&&c!=a) {
			System.out.println("Scalene");
		}else if((a==b && a!=c) || (b==c && c!=a) || (a==c && c!=b) ) {
			System.out.println("Isosceles");
		}
	}//
}
