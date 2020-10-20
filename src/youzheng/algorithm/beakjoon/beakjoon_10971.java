package youzheng.algorithm.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class beakjoon_10971 {
    static int min = Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[][] arr = new int[n][n];
        boolean[] visit = new boolean[n];
        StringTokenizer st = null;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        bfs(arr,visit,0,"");

        System.out.println(min);

    }// main

    private static void bfs(int[][] arr, boolean[] visit, int r, String str) {

        if(r == arr.length){
            check(arr,str);
            return;
        }
        if(r > arr.length);

        for (int i = 0; i < arr.length; i++) {

            if (!visit[i]){

                visit[i] = true;

                bfs(arr,visit,r+1,str+i+" ");

                visit[i] = false;

            }

        }

    }

    private static void check(int[][] arr, String str) {
        int sum = 0;
        String[] strArr = str.split(" ");

        for (int i = 0; i < arr.length-1; i++) {
            int a = Integer.parseInt(strArr[i]);
            int b = Integer.parseInt(strArr[i+1]);

            int value = arr[a][b];
            if (value == 0) {
                return;
            }
            sum += value;
        }
        int huijia = arr[Integer.parseInt(strArr[strArr.length-1])][Integer.parseInt(strArr[0])];
        if(huijia==0){
            return;
        }

        sum += huijia;

        if(sum < min){
            min = sum;
        }


    }



}
