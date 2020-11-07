package youzheng.algorithm.beakjoon.beakjoon1;

//1 = > -1		11 = > -1
//2 = > -1		12 = > 3 3 3 3
//3 = > 3		13 = > 5 5 3
//4 = > -1		14 = > -1
//5 = > 5		15 = > 5 5 5
//6 = > 3+3		16 = >  -1
//7 = > -1		17 = > -1
//8 = > 5+3		18 = > 5 5 5 3
//9 = > 3 + 3 + 3
//10 => 5+5
import java.util.Scanner;

public class beakjoon_2839 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		// 21 = > 5 5 5 3 3
		// 12 = > 3 3 3 3
		// 3 = > 3 13 = > 5 5 3 23 = > 5 5 5 5 3
		// 24 = > 5 5 5 3 3 3
		// 5 = > 5 15 = > 5 5 5
		// 6 = > 3+3 16 = > 5 5 3 3
		// 8 = > 5+3 18 = > 5 5 5 3
		// 9 = > 3+3+3 19 = > 5 5 3 3 3
		// 10 => 5+5 20 = > 5 5 5 5
		int cnt = 0;
		while (num > 0) {

			if (num % 5 == 0) {
				cnt += num / 5;
				num /= 5;
				break;
			} else {
				num -= 3;
				cnt++;
			}

		}
		if (num < 0) {
			System.out.println(-1);
		} else {
			System.out.println(cnt);

		}
	}// main
}
