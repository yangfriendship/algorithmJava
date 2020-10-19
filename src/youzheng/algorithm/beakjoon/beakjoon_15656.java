package youzheng.algorithm.beakjoon;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class beakjoon_15656 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        st= new StringTokenizer(br.readLine());

        int[] arr = new int[n+1];
        Boolean[] visit = new Boolean[n + 1];

        for (int i = 1;i< arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        bfs(arr,visit,0,k,"");
        bw.flush();
        bw.close();


    }
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    private static void bfs(int[] arr, Boolean[] visit, int r, int k, String str) throws IOException {

        if(r ==k ){
            bw.write(str);
            bw.newLine();
            return;
        }

        for (int i = 1; i < arr.length; i++) {

            bfs(arr,visit,r+1,k,str+arr[i]+" ");

        }

    }
}
