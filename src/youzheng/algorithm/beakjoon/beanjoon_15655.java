package youzheng.algorithm.beakjoon;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class beanjoon_15655 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        boolean[] visit = new boolean[n + 1];
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[n+1];
        for (int i = 1; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        bfs(arr,visit,0,1,k,"");
        bw.flush();
        bw.close();

    }//main
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void bfs(int[] arr,boolean[] visit,int r,int start ,int k,String str)throws IOException{

        if (r == k) {
            bw.write(str);
            bw.newLine();
            return;
        }

        for (int i = start; i < arr.length ; i++) {

            if(!visit[i]){
                visit[i] = true;
                bfs(arr,visit,r+1,i,k,str+arr[i]+" ");
                visit[i] = false;

            }

        }

    }
}
