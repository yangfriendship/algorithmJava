package youzheng.algorithm.beakjoon.beakjoon1;

import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class beakjoon_15664 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] arr =new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        boolean[] visit = new boolean[n];

        bfs(arr,visit,0,k,"",0);
        bw.flush();
        bw.close();

    }//main

    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static Set<String> set = new HashSet<>();
    private static void bfs(int[] arr, boolean[] visit, int r, int k, String str,int start) throws IOException {

        if (r == k) {
            if(set.add(str)){
                bw.write(str);
                bw.newLine();
            }
            return;
        }

        for (int i = start; i < arr.length; i++) {

            if(!visit[i]){

                visit[i] = true;
                bfs(arr,visit,r+1,k,str+arr[i]+" ",i);
                visit[i] = false;

            }

        }


    }

}
