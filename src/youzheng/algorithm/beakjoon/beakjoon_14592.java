package youzheng.algorithm.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

class Score {
	int total;
	int count;
	int time;
	int num;

	public Score() {
		// TODO Auto-generated constructor stub
	}

	public Score(int num, int total, int count, int time) {
		super();
		this.num = num;
		this.total = total;
		this.count = count;
		this.time = time;
	}

}

public class beakjoon_14592 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		List<Score> list = new ArrayList<Score>();
		StringTokenizer st = null;
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			list.add(new Score(i + 1, Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()),
					Integer.parseInt(st.nextToken())));
		}

		list.sort(new Comparator<Score>() {

			@Override
			public int compare(Score o1, Score o2) {

				if (o1.total == o2.total) {
					if (o1.count == o2.count) {
						return o1.time - o2.time;
					} else {
						return o1.count - o2.count;
					}
				}
				return o2.total - o1.total;
			}
		});

		System.out.println(list.get(0).num);

	}// main
}
