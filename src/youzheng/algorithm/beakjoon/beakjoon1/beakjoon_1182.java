package youzheng.algorithm.beakjoon.beakjoon1;

import java.io.*;
import java.util.StringTokenizer;

public class beakjoon_1182 {

    static int cnt = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        if (k == 0) {
            cnt = -1;
        }

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        boolean[] visit = new boolean[n];
        bfs(arr, visit, 0, 0, k, 0);
        System.out.println(cnt);

    }

    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    private static void bfs(int[] arr, boolean[] visit, int start, int r, int k, int sum) throws IOException {

        if (k == sum) {

            cnt++;
        }
        if (r >= arr.length) {
            return;
        }

        for (int i = start; i < arr.length; i++) {

            if (!visit[i]) {
                visit[i] = true;
                bfs(arr, visit, i, r + 1, k, arr[i] + sum);
                visit[i] = false;

            }

        }

    }


}
