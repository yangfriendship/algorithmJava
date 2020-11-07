package youzheng.algorithm.beakjoon.beakjoon1;

import java.io.*;

public class beakjoon_9095 {
    static int n;
    static int cnt = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        int[] arr = new int[T];
        int max = 0;
        for (int i = 0; i < T; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            if(arr[i] > max) {
                max = arr[i];
            }
        }

        if(max < 3){
            max = 4;
        }
        int[] dp = new int[max+1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;
        for (int i = 4; i < max + 1 ; i++) {
            dp[i] = dp[i-1]+dp[i-2]+dp[i-3];
        }

        for (int i = 0; i < T; i++) {
            int value = dp[arr[i]];
            bw.write(String.valueOf(value));
            bw.newLine();
        }

        bw.flush();
        bw.close();


    }//main



}
