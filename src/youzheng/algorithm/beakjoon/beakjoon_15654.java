package youzheng.algorithm.beakjoon;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class beakjoon_15654 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        List<Integer> list = new ArrayList<>();
        int[] visit = new int[n];
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            list.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(list);
        bfs(list, visit, 0 , k , "");
        bw.flush();
        bw.close();

    }
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static void bfs(List<Integer> list , int[] visit ,int r, int k, String str)throws IOException{

        if(r == k ) {
            bw.write(str);
            bw.newLine();
        }

        for (int i = 0; i < list.size() ; i++) {

            if(visit[i] == 0){
                visit[i] = 1;
                bfs(list,visit,r+1, k , str+list.get(i)+" ");
                visit[i] = 0;


            }

        }



    }

}
