package youzheng.algorithm.beakjoon.beakjoon2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class beakjoon_1094 {
    /*
     * 23 4
     * 32 1
     * 64 1
     * */
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = 0;
        int x = Integer.parseInt(br.readLine());

        for (int i = 0; i <7 ; i++) {
            cnt += x >> i & 1;
        }

        System.out.println(cnt);



    }
}
