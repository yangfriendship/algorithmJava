package youzheng.algorithm.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class beakjoon_10826 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        BigInteger[] dp = new BigInteger[n+1];
        if (n==0){
            System.out.println(0);
            return;
        }
        dp[0] = BigInteger.valueOf(0);
        dp[1] = BigInteger.valueOf(1);

        for (int i = 2 ; i < dp.length ; i++) {

            BigInteger value = dp[i-1].add(dp[i-2]);
            dp[i] = value;

        }

        System.out.println(dp[dp.length-1]);

    }

}
