	package youzheng.algorithm.beakjoon.beakjoon1;
	
	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;
	import java.util.StringTokenizer;

    public class beakjoon_10162 {
	
		public static void main(String[] args) throws IOException {
	
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer st = new StringTokenizer(br.readLine());
	
			int t = Integer.parseInt(st.nextToken());
			if(t%10!=0) {
				System.out.println(-1);
				return;
			}
			int a = 300; // 5m
			int b = 60; // 1m
			int c = 10; // 10s
	
			int cntA = 0;
			int cntB = 0;
			int cntC = 0;
			while (t!=0) {
	
				if (t - a >= 0) {
					t -= a;
					cntA++;
				} else if (t - b >= 0) {
					t -= b;
					cntB++;
				} else if (t - c >= 0) {
					t -= c;
					cntC++;
				}
	
			}

			System.out.printf("%d %d %d",cntA,cntB,cntC);
		}
	}
