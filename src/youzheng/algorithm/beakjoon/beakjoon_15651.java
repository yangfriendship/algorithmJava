package youzheng.algorithm.beakjoon;
import java.io.*;
import java.util.StringTokenizer;

public class beakjoon_15651 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        visit = new int[n + 1];
        arr = new int[n+1];

        for (int i =0 ; i < arr.length ; i ++){
            arr[i] = i;
        }

        dfs(0 , 0 , k, "");
        bw.flush();
        bw.close();


    }// main

    static int[] visit ;
    static int[] arr;
    static BufferedWriter bw ;

    public static void dfs(int index,int r,int k,String str)throws IOException {

        if(r == k ){
            bw.write(str);
            bw.newLine();
            return;
        }

        if( r > k){
            return;
        }

        for(int i = 1 ; i < arr.length ; i ++){

            if(visit[i] == 0 ){
//                visit[i] = 1;
                dfs(i, r + 1 , k ,(str+arr[i])+" ");
                visit[i] = 0;
            }

        }

    }

}

