package youzheng.algorithm.beakjoon.beakjoon1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

class Ballon {

	int num;
	int value;

	public Ballon(int num, int value) {
		this.num = num;
		this.value = value;
	}
}

public class beakjoon_2346 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());

		List<Ballon> que = new LinkedList<>();
		for (int i = 0; i < n; i++) {
			que.add(new Ballon((i + 1), Integer.valueOf(st.nextToken())));
		}
		int index = 0;
		int next = 0;
		StringBuffer sb = new StringBuffer();
		while (!que.isEmpty()) {

			Ballon value = que.get(index);
			sb.append(value.num + " ");
			int move = value.value;
			next = index;
			if (move > 0) {
				for (int i = 0; i < move - 1; i++) {
					next++;
					if(next== index) {
						next++;
					}
					if (next >= que.size()) {
						next = 0;
					}
				}
			} else if (move < 0) {
				move = move * -1;
				for (int i = 0; i < move; i++) {
					next--;
					if(index == next) {
						next--;
					}
					if (next < 0) {
						next = que.size() - 1;
					}
				}
			}
			que.remove(index);
			if (que.size() == 1) {
				sb.append(que.get(0).num);
				break;
			}

		}
		System.out.print(sb);
	}// main
}
