package youzheng.algorithm.beakjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class beakjoon_1316 {

	public static boolean solve(String str) {

		boolean[] list = new boolean[26];

		char[] word = str.toCharArray();
		
		for (int i = 0; i < word.length-1; i++) {
			boolean result = false;
			if(list[word[i]- 97]) {
				System.out.println(i +" �ش� ���ڴ� �̹� ���Խ��ϴ�. ����");
				return false;
			}
			
			if(word[i]!= word[i+1]) {
				System.out.printf("%d�ε����� %d�ε����� ���� �ٸ��ϴ�.",i,i+1);
				System.out.println();
				if(!list[word[i]-97]) {
					list[word[i]-97] = true; // �� �ε����� ���� �ٸ��� > i�ε����� �̹� ���Դٰ� true���� �־��ش�.
				}else {
					System.out.println("�̹� ������ index -> return");
					return false;
				}
			}else {
				System.out.printf("%d�ε����� %d�ε����� ���� �����ϴ�.",i,i+1);
				System.out.println();
			}
			
			if(list[word[word.length-1]-97]) {
				return false;
			}
			
		}
		return true;
		

	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int total = 0;
		
		for (int i = 0; i < num; i++) {
			
			if (solve(sc.nextLine())) {
				System.out.println(i +"��° �ܾ�  true");
				total++;
			}
		}


		System.out.println(total);
	}
}
