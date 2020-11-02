package youzheng.algorithm.beakjoon;

import java.io.*;
import java.util.StringTokenizer;

public class beakjoon_11722 {
    //가장 긴 감소하는 수열

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        if(n==1){
            System.out.println(1);
            return;
        }

        int max = lis(arr);
        System.out.println(max);

    }//main

    private static int lis(int[] arr) {

        int answer = 0;
        int[] dp = new int[arr.length];
        dp[0] = 1;

        for (int i = 1; i < arr.length; i++) {
            int max = 0;

            for (int j = 0; j < i; j++) {

                if (arr[j] > arr[i] && max < dp[j]){
                    max = dp[j];
                }

            }
            dp[i] = max +1;

            if(dp[i] > answer){
                answer = dp[i];
            }

        }


        return answer;

    }

}
