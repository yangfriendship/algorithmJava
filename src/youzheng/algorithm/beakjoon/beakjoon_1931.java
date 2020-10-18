package youzheng.algorithm.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

//���ǽ� ����
public class beakjoon_1931 {

	static class Time implements Comparable<Time> {
		int start = 0;
		int end = 0;

		public Time() {
			// TODO Auto-generated constructor stub
		}

		@Override
		public int compareTo(Time time) {

			if (this.end > time.end) {
				return 1;
			} else if (this.end == time.end) {
				if (this.start > time.start) {
					return 1;
				} else {
					return -1;
				}
			} else {
				return -1;
			}
		}
	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(br.readLine());
		StringTokenizer st = null;

		Time[] times = new Time[num];

		for (int i = 0; i < times.length; i++) {
			times[i] = new Time();
		}

		for (int i = 0; i < num; i++) {
			st = new StringTokenizer(br.readLine());
			times[i].start = Integer.parseInt(st.nextToken());
			times[i].end = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(times);

		int end = times[0].end;
		int cnt = 1;
		for (int i = 1; i < times.length; i++) {
			if (end <= times[i].start) {
				cnt++;
				end = times[i].end;
			}
		}
		System.out.println(cnt);
	}// main
}// class
