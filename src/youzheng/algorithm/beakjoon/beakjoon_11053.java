package youzheng.algorithm.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class beakjoon_11053 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        if(n == 1) {
            System.out.println(1);
            return;
        }


        int cnt = lis(arr);
        System.out.println(cnt);


    }

    private static int lis(int[] arr) {

        int result = 0;
        int[] dp = new int[arr.length];
        dp[0] = 1;

        for (int i = 1; i <arr.length ; i++) {
            int max = 0;

            for (int j = 0; j < i; j++) {

                if(arr[i] > arr[j] && dp[j] > max){
                    max = dp[j];
                }

            }

            dp[i] = max +1;
            if (result < dp[i]){
                result = dp[i];
            }

        }

        return  result;
    }

}
