package youzheng.algorithm.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class beakjoon_2491 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int result = lis(arr);
        System.out.println(result);

    }//main

    private static int lis(int[] arr) {

        if(arr.length==1){
            return 1;
        }

        int[] dpInc = new int[arr.length];
        int[] dpdes = new int[arr.length];
        dpInc[0] = 1;
        dpdes[0] = 1;
        int result = 0;

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] >= arr[i - 1]) {
                dpInc[i] = dpInc[i - 1] + 1;
            } else {
                dpInc[i] = 1;
            }

            if (arr[i] <= arr[i - 1]) {
                dpdes[i] = dpdes[i - 1] + 1;
            } else {
                dpdes[i] = 1;
            }

            result = Math.max(Math.max(dpdes[i], dpInc[i]), result);


        }

        return result;
    }
}

