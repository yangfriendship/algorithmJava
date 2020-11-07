package youzheng.algorithm.beakjoon.beakjoon1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class beakjoon_9625 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[][] arr = new int[n+1][2];
//        A		A 1 B 0
//        B		A 0 B 1
//        BA		A 1 B 1
//        BAB		A 1 B 2
//        BABBA		A 2 B 3

        if (n ==1){
            System.out.println("0 1");
            return;
        }
        if (n ==2){
            System.out.println("1 1");
            return;
        }

        arr[0][0] = 1;
        arr[0][1] = 0;

        arr[1][0] = 0;
        arr[1][1] = 1;

        arr[2][0] = 1;
        arr[2][1] = 1;

        for (int i = 3; i <= n; i++) {
            arr[i][0] = arr[i-1][0] + arr[i-2][0];
            arr[i][1] = arr[i-1][1] + arr[i-2][1];
        }

        System.out.println(arr[n][0] + " "+arr[n][1]);


    }

}
