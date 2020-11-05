package youzheng.algorithm.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class beakjoon_2294 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] arr = new int[n+1];
        int[] dp = new int[k+1];
        for (int i = 1; i < arr.length ; i++) {
            arr[i] =Integer.parseInt(br.readLine());
        }
        int cnt = 0;
        Arrays.sort(arr);

        dp[0] = 1;
        int minIndex = arr[0];
        for (int i = 1; i < dp.length; i++) {
            int price = i;
            int temp = 0;
            for (int j = 1; j < arr.length ; j++) {
                int coin = arr[j];
                if (price - coin < 0) continue;

                if (price - coin == 0) {
                    dp[i] = 1;

                    break;
                }
                int value = dp[price - coin]+1;

                if (value !=1 && (dp[i] == 0 || dp[i] > value)) {
                    dp[i] = value;
                }
            }
        }

        if(dp[k]==0){
            System.out.println(-1);
            return;
        }else {
            System.out.println(dp[k]);

        }




        //  1 2 3 4 5 6 7 8 9 10
        //2 x 1 x 2 x 3 1 4 2 0
        //5 x x x x 1 x 1 x 1 2
        //12x x x x x x x x x x x
        //T
    }//main

    public static void printArr(int[] arr,int[] dp){

        for (int i = 1; i < dp.length; i++) {
            System.out.printf("%2d ",i);
        }
        System.out.println();

        for (int i = 1; i < dp.length ; i++) {
            System.out.printf("%2d ",dp[i]-1);
        }
    }

}
