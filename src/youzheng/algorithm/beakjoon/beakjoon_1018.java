package youzheng.algorithm.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class beakjoon_1018 {

	static int min = 99999999;
	
	static String[] input = new String[50];
	static char temp = 'a';
	public static void solve(int y, int x) {
		int cntB= 0;
		int cntW= 0;
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				int realX = x+j;
				int realY = y+i;
				if((realX+realY)%2 ==0) {
					//B�� ����
					
					if ((input[realY].charAt(realX)=='W')) {
						cntB ++;
					}else {
						cntW ++;
					}
				}else if((realX+realY)%2!=0) {
					if ((input[realY].charAt(realX)=='B')) {
						cntB ++;
					}else {
						cntW ++;
					}
				}
			}
		}
		min = Math.min(cntW, Math.min(cntB, min));
	}
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());

		for (int i = 0; i < m; i++) {
			
			input[i] = br.readLine();
				
		}

		for (int i = 0; i <= m-8 ; i++) {
			
			for (int j = 0; j <= n-8; j++) {
				
				solve(i,j);
			}
		}
		System.out.println(min);
	}
}
