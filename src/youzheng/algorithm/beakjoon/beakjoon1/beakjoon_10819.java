package youzheng.algorithm.beakjoon.beakjoon1;

import java.io.*;
import java.util.StringTokenizer;

public class beakjoon_10819 {
    static int max = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        boolean[] visit = new boolean[n];

        bfs(arr, visit , 0, "");
        System.out.println(max);


    }//main

    private static void bfs(int[] arr, boolean[] visit, int r ,String str) {

        if (r == arr.length) {

            check(r,str);

            return;
        }
        if(r > arr.length){
            return;
        }

        for (int i = 0; i < arr.length; i++) {

            if(!visit[i]){
                visit[i] = true;
                bfs(arr,visit,r+1,str+arr[i]+" ");
                visit[i] = false;
            }

        }


    }

    private static void check(int r, String str) {
        String[] arr = str.split(" ");
        int sum = 0;
        for (int i = 0; i < r-1 ; i++) {

            int a = Integer.parseInt(arr[i]);
            int b = Integer.parseInt(arr[i+1]);

            sum+= Math.abs(a-b);

        }
        if(sum > max){
            max = sum;
        }

    }


}
