package youzheng.algorithm.beakjoon.beakjoon1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class beakjoon_10810 {

            /*5 4
            1 2 3
            3 4 4
            1 4 1
            2 2 2*/
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n+1];

        for (int i = 0; i < m; i++) {

            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int boll = Integer.parseInt(st.nextToken());

            for (int j = start; j <= end ; j++) {
                arr[j] = boll;
            }

        }

        for (int i = 1; i < arr.length ; i++) {

            System.out.printf("%d ",arr[i]);
        }



    }

}
