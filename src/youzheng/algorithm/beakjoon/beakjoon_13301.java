package youzheng.algorithm.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class beakjoon_13301 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Long n = Long.parseLong(br.readLine());


        long a = 1;
        long b = 1;

        for (int i = 0; i < n-1; i++) {

            long temp = b;
            b += a;
            a= temp;

        }

        System.out.println(a*2 + b*2);



    }

}
