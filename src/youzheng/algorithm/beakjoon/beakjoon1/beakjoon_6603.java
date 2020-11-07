package youzheng.algorithm.beakjoon.beakjoon1;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class beakjoon_6603 {

    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


    public static void main(String[] args) throws IOException {

            solve();

            bw.flush();
            bw.close();


    }//main

    public static void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

       while(true){
           StringTokenizer st = new StringTokenizer(br.readLine());


           int n = Integer.parseInt(st.nextToken());
           if(n==0){
               return;
           }

           int[] arr = new int[n];

           for (int i = 0; i < n; i++) {
               arr[i] = Integer.parseInt(st.nextToken());
           }

           boolean[] visit = new boolean[n];
           Arrays.sort(arr);
           bfs(arr, visit, 0,0, 6, "");
           bw.newLine();
       }

    }


    private static void bfs(int[] arr, boolean[] visit, int r,int start,int k, String str) throws IOException {

        if (r == k) {
            bw.write(str);
            bw.newLine();
            return;
        }
        if(r>k){
            return;
        }

        for (int i = start; i < arr.length; i++) {

            if(!visit[i]){
                visit[i] = true;
                bfs(arr,visit,r+1,i,k,str+arr[i]+" ");
                visit[i] = false;
            }


        }


    }

}
