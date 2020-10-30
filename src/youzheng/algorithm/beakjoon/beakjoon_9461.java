package youzheng.algorithm.beakjoon;

import java.io.*;

public class beakjoon_9461 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        int[] arr = new int[T+1];
        int max = 0;
        for (int i = 0; i < T; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            if(arr[i] > max){
                max = arr[i];
            }
        }

        if(max <5){
            max = 5;
        }

        long[] dp = new long[max+1];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 1;
        dp[3] = 1;
        dp[4] = 2;
        dp[5] = 2;

        for (int i = 6; i < max+1; i++) {
            dp[i] = dp[i-1] + dp[i-5];
        }

        for (int i = 0; i < T; i++) {
            long value = dp[arr[i]];
            bw.write(String.valueOf(value));
            bw.newLine();
        }

        bw.flush();
        bw.close();

    }//main

}
