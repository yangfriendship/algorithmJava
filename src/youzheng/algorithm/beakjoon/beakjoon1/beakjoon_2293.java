package youzheng.algorithm.beakjoon.beakjoon1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class beakjoon_2293 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] arr = new int[n+1];
        int[] dp = new int[k+1];
        for (int i = 1; i < arr.length ; i++) {
            arr[i] =Integer.parseInt(br.readLine());
        }

        dp[0] = 1;
        for (int i = 1; i < arr.length; i++) {

            for (int j = arr[i]; j < dp.length; j++) {
                dp[j] += dp[j - arr[i]];
            }
        }


        System.out.println(dp[k]);





    }//main

}
