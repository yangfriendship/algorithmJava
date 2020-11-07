package youzheng.algorithm.beakjoon.beakjoon2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class beakjoon_15651 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] arr = new int[n+1];
        for (int i = 1; i <arr.length ; i++) {
            arr[i] = i;
        }

        bfs(arr,k,0,"");
        System.out.println(sb);
    }

    static StringBuffer sb = new StringBuffer();

    private static void bfs(int[] arr, int k,int r,String sum) {

        if(r == k){
            sb.append(sum+"\n");
            return;
        }

        for (int i = 1; i < arr.length; i++) {

            bfs(arr,k,r+1,sum+arr[i]+" ");

        }


    }

}
