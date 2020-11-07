package youzheng.algorithm.beakjoon.beakjoon1;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class beakjoon_2529 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = getArr();
        String[] strArr = (br.readLine().replaceAll(" ","")).split("");
        int k = strArr.length+1;
        boolean[] visit = new boolean[10];
        bfs(arr,visit,strArr,0,k,"");
        Collections.sort(list);
        System.out.println(list.get(list.size()-1));
        System.out.println(list.get(0));


    }//main
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static List<String> list = new ArrayList<>();
    private static void bfs(int[] arr, boolean[] visit, String[] strArr, int r, int k, String str) throws IOException {

        if (r  > k){
            return;
        }

        if (r == k) {
            if (isValid(str, strArr)) {

                list.add(str);
            }
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            if (!visit[i]) {
                visit[i] = true;
                bfs(arr, visit, strArr, r + 1, k, str + arr[i]);
                visit[i] = false;
            }


        }

    }

    private static boolean isValid(String str, String[] strArr) {

        for (int i = 0; i < str.length()-1; i++) {

            int a = str.charAt(i)-'0';
            int b = str.charAt(i + 1) - '0';

            switch (strArr[i]){
                case "<" :
                    if (a>=b){
                        return false;
                    }

                    break;
                case ">" :
                    if(a<=b){
                        return  false;
                    }

                    break;
            }
        }


        return true;
    }

    private static int[] getArr() {
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = i;
        }
        return arr;
    }

}
