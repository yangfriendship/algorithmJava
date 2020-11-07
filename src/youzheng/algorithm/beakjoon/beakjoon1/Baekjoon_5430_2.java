package youzheng.algorithm.beakjoon.beakjoon1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class Baekjoon_5430_2 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		//�׽�Ʈ ���̽� ��(T)
		int t = Integer.parseInt(reader.readLine());
		for(int i = 0; i < t; i++) {
			//������ �Լ� (P)
			String[] p = reader.readLine().split("");
			//�迭�� ����(N)
			int n = Integer.parseInt(reader.readLine());
			//�迭
			String[] x = reader.readLine().replace("[", "").replace("]", "").split(",");
			
			String result = ac(p, n, x);
            //��� ���
			System.out.println(result);
		}
	}

	private static String ac(String[] p, int n, String[] x) {
		Deque<Integer> dQ = makeDq(n, x);
		String dir = "LEFT";
		
		for (String order : p) {
			if("R".equals(order)) {
				if(dir.equals("LEFT")) {
					dir = "RIGHT";
				}else {
					dir = "LEFT";
				}
			}else if("D".equals(order)) {
				if(dQ.isEmpty()) {
					return "error";
				}else {
					if(dir.equals("LEFT")) {
						dQ.pollFirst();
					}else {
						dQ.pollLast();
					}
				}
			}
		}
		StringBuilder sb = showPrint(dQ, dir);
		return sb.toString();
	}
	
	private static StringBuilder showPrint(Deque<Integer> dQ, String dir) {
		int dqLen = dQ.size();
		StringBuilder sb = new StringBuilder("[");
		for(int i = 0; i < dqLen; i++) {
			if(dir.equals("LEFT")) {
				sb.append(dQ.pollFirst());
			}else {
				sb.append(dQ.pollLast());
			}
			if(!dQ.isEmpty()) sb.append(",");
		}
		sb.append("]");
		return sb;
	}

	private static Deque<Integer> makeDq(int n, String[] x){
		Deque<Integer> dQ = new LinkedList<Integer>();
		for(int i = 0; i < n; i++) {
			dQ.add(Integer.parseInt(x[i]));
		}
		return dQ;
	}
}