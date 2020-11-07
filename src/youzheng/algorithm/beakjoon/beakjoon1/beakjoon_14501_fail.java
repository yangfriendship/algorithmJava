package youzheng.algorithm.beakjoon.beakjoon1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class beakjoon_14501_fail {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int day = 0;

        int[][] arr = new int[n + 1][2];
        StringTokenizer st = null;
        for (int i = 1; i < arr.length; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        int[] dp = new int[n + 1];
        int next = 0;
        for (int i = 1; i < n + 1; i++) {
            int max = 0;
            for (int j = 1; j < i; j++) {

                if (arr[j][0] + j < n+1 && j >= next) {
                    max += arr[j][1];
                    System.out.printf("%d \n",j);
                    next = j;
                }

            }
            dp[i] = max;
        }
        System.out.println(dp[n]);

    }//main

}
