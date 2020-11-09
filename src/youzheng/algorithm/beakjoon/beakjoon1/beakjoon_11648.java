package youzheng.algorithm.beakjoon.beakjoon1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class beakjoon_11648 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        if(n < 10){
            System.out.println(0);
            return;
        }
        while(n > 9){
            int temp = 1;
            while(n > 0 ){
                temp *= (n%10);
                n /= 10;
            }
            n = temp;
            cnt ++;
        }

        System.out.println(cnt);


    }

}
