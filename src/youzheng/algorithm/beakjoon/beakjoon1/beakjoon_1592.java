package youzheng.algorithm.beakjoon.beakjoon1;

import jdk.internal.util.xml.impl.Input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class beakjoon_1592 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        int index = 0;
        int cnt = 0;
        while (true) {

            arr[index]++;
            if(arr[index] == m){
                break;
            }
            cnt ++;
            index = move(index, n, arr[index],l);
        }
        System.out.println(cnt);
    }

    private static int move(int index, int n, int r, int l) {

        if (r% 2 == 0){
            if(index - l>=0){
                return index - l;
            }else {
                return n + (index - l);
            }
        }else {
            if(index + l < n){
                return index+l;
            }else {
                return (index+l) - n;
            }

        }
    }

}
