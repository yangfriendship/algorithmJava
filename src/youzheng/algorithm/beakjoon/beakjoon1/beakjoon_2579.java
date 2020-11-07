package youzheng.algorithm.beakjoon.beakjoon1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class beakjoon_2579 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int[] dp = new int[arr.length];

        if(n ==1){
            System.out.println(arr[0]);
            return;
        }else if(n==2){
            System.out.println(arr[0] + arr[1]);
            return;
        }else if(n==3){
            dp[2] = Math.max(arr[0] + arr[2], arr[1] + arr[2]);
            return;
        }

        dp[0] = arr[0];

        dp[1] = arr[0] + arr[1];

        dp[2] = Math.max(arr[0] + arr[2], arr[1] + arr[2]);


        for (int i = 3; i < n; i++) {

            dp[i] = Math.max(dp[i - 3] + arr[i - 1] + arr[i], dp[i - 2] + arr[i]);
        }

        System.out.println(dp[n - 1]);

    }


}
