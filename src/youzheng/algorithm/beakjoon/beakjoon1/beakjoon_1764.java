package youzheng.algorithm.beakjoon.beakjoon1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class beakjoon_1764 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int ting = Integer.parseInt(st.nextToken());
		int kan = Integer.parseInt(st.nextToken());
		
		Set<String> tingList = new HashSet<String>();
		List<String> result = new ArrayList<>();
		String input = "";
		for (int i = 0; i < ting; i++) {
			tingList.add(br.readLine());
		}
		
		for (int i = 0; i < kan; i++) {
			input = br.readLine();
			if (tingList.contains(input)) {
				result.add(input);
			}
			
		}
		Collections.sort(result);
		int cnt = result.size();
		System.out.println(cnt);
		
		for (int i = 0; i < cnt; i++) {
			System.out.println(result.get(i));
		}
		

		
	}
}
