package youzheng.algorithm.beakjoon.beakjoon1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class beakjoon_1251 {
	public static String reverse(String str) {

		if (str.length() == 1) {
			return str;
		}

		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < str.length(); i++) {
			sb.append(str.charAt(str.length() - 1 - i));
		}

		return sb.toString();

	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();

		if(str.length()==3) {
			StringBuffer sb = new StringBuffer();
			char[] c = str.toCharArray();
			
			for (int i = 0; i < c.length-1; i++) {
				char temp ;
				int min = i;
				for (int j = i+1; j < c.length; j++) {

					if(c[min] > c[j]) {
						min = j;
					}
					
				}
				temp = c[min];
				c[min] = c[i];
				c[i] = temp;
			}
			System.out.printf("%c%c%c",c[0],c[1],c[2]);
			return ;
		}
		
		String value = "";
		String value2 = "";
		String value3 = "";

		String[] result = new String[10000000];
		int cnt = 0;
		for (int i = 1; i < str.length() - 2; i++) {

			for (int j = i + 1; j < str.length() + 1; j++) {

				value = reverse(str.substring(0, i));
				value2 = reverse(str.substring(i, j));
				value3 = reverse(str.substring(j, str.length()));

				result[cnt] = value + value2 + value3;
				cnt++;
			}

		}

		for (int i = 0; i < cnt - 1; i++) {

			int min = i;
			String temp = "";
			for (int j = i + 1; j < cnt; j++) {

				if (result[min].compareTo(result[j]) >= 0) {
					min = j;
				}

			}
			temp = result[min];
			result[min] = result[i];
			result[i] = temp;
		}
		System.out.println(result[0]);

	}
}
