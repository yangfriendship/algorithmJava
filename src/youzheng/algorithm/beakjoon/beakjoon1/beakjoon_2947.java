package youzheng.algorithm.beakjoon.beakjoon1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class beakjoon_2947 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] =Integer.parseInt(st.nextToken());
        }

        while(!check(arr)){
            for (int i = 0; i < arr.length-1; i++) {

                if(arr[i] > arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    printArr(arr);
                }
            }

        }


    }

    private static boolean check(int[] arr) {

        for (int i = 0; i < arr.length-1; i++) {

            if(arr[i]+1 != arr[i+1]){
                return false;
            }
        }
        return true;

    }

    private static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {

            System.out.printf("%d ",arr[i]);

        }
        System.out.println();
    }

}
