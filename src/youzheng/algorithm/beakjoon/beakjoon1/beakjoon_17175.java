package youzheng.algorithm.beakjoon.beakjoon1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class beakjoon_17175 {

    static int cnt = 0;
    public static int func(int n) {
        cnt ++;
        if (n < 2) {
            return n;
        }
        return func(n-2) + func(n-1);
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        long result = solve(n);

        System.out.println(result);

    }

    private static long solve(int n) {

        long[] dp = new long[n + 1];
        if (n < 2) {
            return 1;
        }

        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 3;

        for (int i = 3; i < dp.length; i++) {
            long value = dp[i - 1] + dp[i - 2] + 1;
            dp[i] = value%1000000007;

        }
        // 2    3
        // 3    5
        // 4    9
        // 5    15
        // 6    25
        // 7    41
        // dp[n] = dp[n-1] + dp[n-2] + 1;

        return dp[n];
    }

}
