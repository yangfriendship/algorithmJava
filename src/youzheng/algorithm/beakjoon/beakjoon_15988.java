package youzheng.algorithm.beakjoon;

import java.io.*;

public class beakjoon_15988 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());

       while(T-- > 0){
           int n = Integer.parseInt(br.readLine());

           if(n == 1){
               bw.write(String.valueOf(1));
               bw.newLine();
               continue;
           }else if (n == 2){
               bw.write(String.valueOf(2));
               bw.newLine();
               continue;
           }else if (n==3){
               bw.write(String.valueOf(4));
               bw.newLine();
               continue;
           }


           long[] dp = new long[n+1];
           dp[1] = 1;
           dp[2] = 2;
           dp[3] = 4;

           for (int i = 4; i <= n ; i++) {
               dp[i] = (dp[i-1]+dp[i-2]+dp[i-3]) %1000000009;
           }

           bw.write(String.valueOf(dp[n]));
           bw.newLine();
       }
       bw.flush();
       bw.close();




    }//main

}
