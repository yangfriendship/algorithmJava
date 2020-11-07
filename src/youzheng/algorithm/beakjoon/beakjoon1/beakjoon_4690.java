package youzheng.algorithm.beakjoon.beakjoon1;

import java.util.ArrayList;
import java.util.List;

public class beakjoon_4690 {

	public static void main(String[] args) {

		int a = 50;
		List<String> list = new ArrayList<String>();

		for (int i = 1; i < a; i++) {
			
			for (int j = 1; j < a; j++) {
				
				for (int j2 = 1; j2 < a; j2++) {
					
					for (int k = 1; k < a; k++) {
						
						if(triple(k)== triple(j2)+triple(j)+ triple(i)) {
							System.out.println(triple(k));
							if(triple(k)>100) {
								break;
							}
						}
						
					}
					
				}
				
			}
			
		}

	}

	public static int triple(int num) {
		return (int) Math.pow(num, 3);
	}

	public static int check(int a, int b, int c) {
		double value = triple(a) + triple(b) + triple(c);
		double result = Math.cbrt(value);
		if (result == (int) result) {
			return (int) result;
		}

		return 0;
	}

}
