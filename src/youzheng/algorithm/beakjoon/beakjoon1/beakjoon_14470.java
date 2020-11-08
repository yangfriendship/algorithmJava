package youzheng.algorithm.beakjoon.beakjoon1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class beakjoon_14470 {

    public static void main(String[] args) throws IOException {

//       A= 시작온도 -10
//       B =목표 온도 20
//       C = 영하일때 1도당 필요한 온도 5
//       D = 10
//       E = 고기가 얼어있지 않다면 3

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int time = 0;

        if(arr[0]<0){
            time = (Math.abs(arr[0])*arr[2] )+ (arr[1] * arr[4] )+ arr[3];
            System.out.println(time);
        }else if(arr[0]>=0){
            time = (arr[1] - arr[0]) * arr[4];
            System.out.println(time);
        }

    }

}
