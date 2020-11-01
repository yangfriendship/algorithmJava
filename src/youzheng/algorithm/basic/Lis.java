package youzheng.algorithm.basic;

public class Lis {

    static int[] dp;

    static int lis(int[] arr) {
        int maxValue = Integer.MIN_VALUE;

        for (int i = 1; i < arr.length; i++) {
            int max = 0;

            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[i] && dp[j] > max) {
                    max = dp[j];
                }

            }
            dp[i] = max + 1;
            if (dp[i] > maxValue) {
                maxValue = dp[i];
            }

        }

        return maxValue;
    }

}
