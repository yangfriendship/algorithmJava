package youzheng.algorithm.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class beakjoon_1965 {
    //가장 긴 증가하는 수열 문제.
    //
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        dp = new int[n];
        dp[0] = 1;

        int answer = lis(arr);
        System.out.println(answer);

    }

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


    public static void printArr(int[] arr) {
        Arrays.stream(arr).forEach(item -> {
            System.out.printf("%d ", item);
        });
    }

}
