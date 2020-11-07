package youzheng.algorithm.beakjoon.beakjoon1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class beakjoon_1302 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		Map<String, Integer> map = new HashMap<String, Integer>();

		while (n-- > 0) {
			String name = br.readLine();

			if (map.containsKey(name)) {
				map.put(name, map.get(name) + 1);
			} else {
				map.put(name, 1);
			}
		}

		List<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(map.entrySet());
		Collections.sort(list, new Comparator<Entry<String, Integer>>() {
			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {

				if (o1.getValue() == o2.getValue()) {
					return o1.getKey().compareTo(o2.getKey());
				} else {
					return o2.getValue() - o1.getValue();
				}
			}
		});
		System.out.println(list.get(0).getKey());
	}// main
}
