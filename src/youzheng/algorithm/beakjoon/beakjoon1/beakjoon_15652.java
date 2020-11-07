package youzheng.algorithm.beakjoon.beakjoon1;

import java.io.*;
import java.util.StringTokenizer;

public class beakjoon_15652 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] arr = new int[n+1];
        int[] visit = new int[n+1];

        for (int i = 1; i < arr.length; i++) {
            arr[i] = i;
        }

        bfs(arr , visit , 1,0, k,"");
        bw.flush();
        bw.close();

    }//main

    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    private static void bfs(int[] arr, int[] visit,int index, int r, int k,String str) throws IOException {

        if( r == k) {
            bw.write(str);
            bw.newLine();
            return ;
        }

        for (int i = index ; i < arr.length ; i++) {

            if(visit[i] ==0){

                bfs(arr,visit,i,r+1,k,str+arr[i]+" ");


            }
        }

    }

    static void print(int[] arr, int[] visit){

        for (int i = 1; i < arr.length; i++) {
            if (visit[i] == 1){
                System.out.print(arr[i]);
            }
        }
        System.out.println();

    }

}
