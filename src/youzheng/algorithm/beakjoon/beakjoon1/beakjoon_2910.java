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
import java.util.StringTokenizer;

public class beakjoon_2910 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		st = new StringTokenizer(br.readLine());
		StringBuffer sb = new StringBuffer();
		List<Integer> values = new ArrayList<Integer>();

		while (st.hasMoreTokens()) {
			int value = Integer.parseInt(st.nextToken());

			if (map.containsKey(value)) {
				map.put(value, map.get(value) + 1);
			} else {
				map.put(value, 1);
				values.add(value);
			}
		}
		List<Entry<Integer, Integer>> list = new ArrayList<Entry<Integer, Integer>>(map.entrySet());

		Collections.sort(list, new Comparator<Entry<Integer, Integer>>() {

			@Override
			public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {

				if (o1.getValue() == o2.getValue()) {
					return values.indexOf(o1.getKey()) - values.indexOf(o2.getKey());
				}

				return o2.getValue() - o1.getValue();
			}
		});

		for (int i = 0; i < list.size(); i++) {
			int key = list.get(i).getKey();
			int value = list.get(i).getValue();

			for (int j = 0; j < value; j++) {
				sb.append(key + " ");
			}

		}
		System.out.println(sb.delete(sb.length() - 1, sb.length()));

	}// main

}
