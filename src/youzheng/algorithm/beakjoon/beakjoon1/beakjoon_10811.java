package youzheng.algorithm.beakjoon.beakjoon1;

import jdk.internal.util.xml.impl.Input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class beakjoon_10811 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st =new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n+1];

        for (int i = 1; i <= n; i++) {
            arr[i] = i;
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            
            reverse(arr,start,end);
            
        }

        for (int i = 1; i < arr.length; i++) {
            System.out.printf("%d ",arr[i]);
        }


    }

    private static void reverse(int[] arr, int start, int end) {

        int[] temp = Arrays.copyOfRange(arr, start, end+1);
        int add = 0;
        for (int i = start; i <= end; i++) {
            arr[i] = temp[temp.length-1-add];
            add ++;
        }

    }

}
