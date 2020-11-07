package youzheng.algorithm.beakjoon.beakjoon1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class beakjoon_12605 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		int cnt = 0;
		while (cnt++ < N) {
			String[] arr = br.readLine().split(" ");
			bw.append(String.format("Case #%d: ", cnt));
			for (int i = arr.length - 1; i >= 0; i--) {
				bw.append(arr[i]);
				if (i != 0) {
					bw.append(" ");
				}
			}
			bw.append("\n");
		}

		bw.flush();
		bw.close();

	}// main
}
