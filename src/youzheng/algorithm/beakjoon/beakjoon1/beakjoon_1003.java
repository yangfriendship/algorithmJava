package youzheng.algorithm.beakjoon.beakjoon1;

import java.io.*;

public class beakjoon_1003 {



    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        int max = 0;

        int[] arr = new int[T];
        for (int i = 0; i < T; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            if (max < arr[i]){
                max = arr[i];
            }
        }
        int[][] dp = new int[max+1][2];



        dp[0][0] = 1;
        dp[0][1] = 0;

        dp[1][0] = 0;
        dp[1][1] = 1;
        if(max >1){
            for (int i = 2; i <= max; i++) {
                dp[i][0] = dp[i-1][0] + dp[i-2][0];
                dp[i][1] = dp[i-1][1] + dp[i-2][1];
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i : arr){
            if (i == 0){
                bw.write(dp[0][0] + " " + dp[0][1]);
                bw.newLine();

                continue;
            }
            if (i == 1){
                bw.write(dp[1][0] + " " + dp[1][1]);
                bw.newLine();
                continue;
            }

            bw.write(dp[i][0]+" "+ dp[i][1]);
            bw.newLine();

        }
        br.close();
        bw.flush();
        bw.close();




    }

}
