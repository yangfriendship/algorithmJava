package youzheng.algorithm.beakjoon.beakjoon1;

import java.io.*;
import java.util.StringTokenizer;

public class beakjoon_2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        StringTokenizer st = null;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(T-- > 0){
            st = new StringTokenizer(br.readLine());

            int repeat = Integer.parseInt(st.nextToken());

            String str = st.nextToken();
            for (int i = 0; i < str.length(); i++) {
                for (int j = 0; j < repeat; j++) {
                    bw.write(str.charAt(i));
                }
            }
            bw.newLine();
        }

        bw.flush();
        bw.close();





    }//main
}
