package youzheng.algorithm.beakjoon.beakjoon1;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class beakjoon_15657 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        int[] arr = new int[n];
        boolean[] visit = new boolean[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        bfs(arr, visit, 0, 0, k, "");

        bw.flush();
        ;
        bw.close();


    }//main

    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    private static void bfs(int[] arr, boolean[] visit, int start, int r, int k, String str) throws IOException {

        if (r == k) {
            bw.write(str);
            bw.newLine();
            return;
        }
        for (int i = start; i < arr.length; i++) {
                bfs(arr, visit, i, r + 1, k, str + arr[i] + " ");
        }
    }

}
