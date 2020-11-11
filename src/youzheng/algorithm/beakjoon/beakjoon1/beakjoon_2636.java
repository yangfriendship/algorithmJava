package youzheng.algorithm.beakjoon.beakjoon1;

import jdk.internal.util.xml.impl.Input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class beakjoon_2636 {

    static int n;
    static int m;
    static int cnt;
    static int T = 1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int turn = 0;
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                int value = Integer.parseInt(st.nextToken());

                    arr[i][j] = value;

            }
        }
        T++;
        br.close();
        st = null;
        cnt = getcount(arr);
        paintSide(arr);
        printArr(arr);
        int answer = cnt;
        while(cnt > 0 ){

            answer = cnt;
            System.out.println(answer);

            for (int i = 0; i < arr.length; i++) {

                for (int j = 0; j < arr[0].length; j++) {

                    int target = arr[i][j];
                    boolean flag = false;
                    int[] x = {0, 0, 1, -1};
                    int[] y = {-1, 1, 0, 0};
                    //상하좌우 for문
                    if (target == 1) {
                        for (int k = 0; k < 4; k++) {
                            if (isSide(arr, i + y[k], j + x[k])) {
                                flag = true;
                                break;       //만약에 상하좌우중 하나가 c라면 종료 
                            }
                        }
                    }
                    //상하좌우 for문
                    if (flag) {      // 외벽이 c라면 녹여짐
                        arr[i][j] = T+1;
                        cnt --;
                    }
                } // inner for
            }//for1
            for (int i = 0; i < arr.length; i++) {

                for (int j = 0; j < arr[0].length; j++) {

                    if(arr[i][j] == T){
                        bfs(arr,i,j);
                    }

                }

            }


        }





    }

    public static boolean isSide(int[][] arr, int y, int x) {

        if (arr[y][x] == T) {
            return true;
        }
        return false;
    }

    public static void paintSide(int[][] arr) {
        for (int i = 0; i < m; i++) {
            if (arr[0][i] == 0) {
                bfs(arr, 0, i);
            }
        }
        for (int i = 0; i < m; i++) {
            if (arr[n - 1][i] == 0) {
                bfs(arr, n - 1, i);
            }
        }

        for (int i = 0; i < n; i++) {
            if (arr[i][0] == 0) {
                bfs(arr, i, 0);
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i][m - 1] == 0) {
                bfs(arr, i, m - 1);
            }
        }
    }

    public static int getcount(int[][] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[0].length; j++) {

                if (arr[i][j] == 1) {
                    count++;
                }

            }
        }
        return count;
    }

    public static void printArr(int[][] arr,String str) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(arr[i][j]==1){
                    System.out.printf("%d ", arr[i][j]);
                }else {
                    System.out.printf("%d ", 0);
                }
            }
            System.out.println();
        }
    }

    public static void printArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.println();
        }
    }

    public static boolean isRng(int y, int x) {

        if (x < 0 || x >= m || y < 0 || y >= n) {
            return false;
        }
        return true;
    }

    public static void bfs(int[][] arr, int y, int x) {



        if (arr[y][x] != 1 ) {
            arr[y][x] = T;
        }
        if (isRng(y + 1, x)) {
            if (arr[y + 1][x] == 0) {
                bfs(arr, y + 1, x);
            }
        }
        if (isRng(y - 1, x)) {
            if (arr[y - 1][x] == 0 ) {
                bfs(arr, y - 1, x);
            }
        }
        if (isRng(y, x + 1)) {
            if (arr[y][x + 1] == 0 ) {
                bfs(arr, y, x + 1);
            }
        }
        if (isRng(y, x - 1)) {
            if (arr[y][x - 1] == 0 ) {
                bfs(arr, y, x - 1);
            }
        }


        return;
    }

}
