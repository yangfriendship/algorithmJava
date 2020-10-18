package youzheng.algorithm.beakjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class beakjoon_2231 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(br.readLine());
		int temp = num;

		int cnt = 0;
		int result = 0;

		for (int i = num / 2; i < 10000001; i++) {
			if(i== 10000000) {
				System.out.println(0);
				break;
			}
			
			int n = i;
			int sum = 0;
			while (n != 0) {
				sum += n % 10;
				n /= 10;
			}
			if (sum + i == num) {
				result = i;
				break;
			}
		}
		bw.write(Integer.toString(result));
		bw.close();
		br.close();
	}

}
