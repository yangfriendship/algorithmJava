package youzheng.algorithm.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class beakjoon_1149 {
    static final int R = 0;
    static final int G = 1;
    static final int B = 2;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[][] arr = new int[n][3];

        StringTokenizer st = null;

        for (int i = 0; i <n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 3; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int[][] dp = new int[n][n];

        dp[0][R] = arr[0][R];
        dp[0][G] = arr[0][G];
        dp[0][B] = arr[0][B];

        for (int i = 1; i < arr.length; i++) {

            for (int j = 0; j < arr[0].length; j++) {
                int minValue = Integer.MAX_VALUE;

                for (int k = 0; k < 3; k++) {
                    if(j == k) continue;
                    minValue = minValue > dp[i-1][k] ?  dp[i-1][k]:minValue;
                }
                dp[i][j] = arr[i][j] + minValue;

            }
            
        }


        System.out.println(Math.min(Math.min(dp[n-1][0],dp[n-1][1]),dp[n-1][2]));


    }//main

    public static int getAotherIndex(int i){
            return 0;
    }

    public static int getMin(int[] ints, int i, int i2) {
        return Math.min(ints[i], ints[i2]);
    }

    public static void printArr(int[][] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.println();
        }

        System.out.println("========================");
    }

}
