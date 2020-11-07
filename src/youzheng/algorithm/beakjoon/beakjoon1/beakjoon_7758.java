package youzheng.algorithm.beakjoon.beakjoon1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Iterator;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class beakjoon_7758 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];

		TreeMap<String, Boolean> map = new TreeMap<String, Boolean>();
		StringTokenizer st = null;
		while (n-- > 0) {
			st = new StringTokenizer(br.readLine());
			map.put(st.nextToken(), st.nextToken().equals("enter") ? true : false);
		}

		Iterator<String> mapKeys = map.descendingKeySet().iterator();

		while (mapKeys.hasNext()) {
			String name = mapKeys.next();
			if (map.get(name)) {
				System.out.println(name);
			}
		}

	}// main
}
