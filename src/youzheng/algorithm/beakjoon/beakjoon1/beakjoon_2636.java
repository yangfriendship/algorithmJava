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
    static int T = 2;

    static boolean[][] visit;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        int[][] arr = new int[n][m];
        visit = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                int value = Integer.parseInt(st.nextToken());
                arr[i][j] = value;

            }
        }
        br.close();
        st = null;

        if(n<= 2 || m<=2){
            if(getcount(arr)==0){
                System.out.println(0);
                System.out.println(0);
                return;
            }
            System.out.println(1);
            System.out.println(getcount(arr));
            return;
        }


        paintSide(arr); //처음 입력받은 후 작업
        visit = new boolean[n][m];
        int cnt = getcount(arr);
        int answer = cnt ;
        int turn = 0;

        while(cnt>0){
            turn ++;
            answer = cnt;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {

                    if(arr[i][j] == 1 && isSide(arr,i,j)){
                        arr[i][j] = T+1;
                        cnt--;
//                        bfs(arr,i,j);
                    }
                }
            }
            T++;
            paintSide(arr);
//            printArr(arr,"");
//            System.out.println("---------------");
        }

        System.out.println(turn);
        System.out.println(answer);


    }

    public static boolean isSide(int[][] arr, int y, int x) {
        if (!isRng(y,x)){
            return true;
        }
        if(isRng(y+1,x)){
            if(arr[y+1][x] == T){
                return true;
            }
        }
        if(isRng(y-1,x)){
            if(arr[y-1][x] == T){
                return true;
            }
        }
        if(isRng(y,x+1)){
            if(arr[y][x+1] == T){
                return true;
            }
        }
        if(isRng(y,x-1)){
            if(arr[y][x-1] == T){
                return true;
            }
        }


        return false;
    }

    public static void paintSide(int[][] arr) {
        for (int i = 0; i < m; i++) {
            if (arr[0][i] < T && arr[0][i] !=1) {
                bfs(arr, 0, i);
            }
        }
        for (int i = 0; i < m; i++) {
            if (arr[n - 1][i] < T && arr[n-1][i] !=1) {
                bfs(arr, n - 1, i);
            }
        }

        for (int i = 0; i < n; i++) {
            if (arr[i][0] < T && arr[i][0] !=1) {
                bfs(arr, i, 0);
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i][m - 1] < T && arr[i][m-1] !=1) {
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

    public static void printArr(int[][] arr, String str) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == 1) {
                    System.out.printf("%d ", arr[i][j]);
                } else {
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

        if(arr[y][x] < T && arr[y][x] != 1){
            arr[y][x] = T;
        }

        if (arr[y][x] == 1) {
//            visit[y][x] = true;
            return;
        }

        if (isRng(y + 1, x) && !visit[y+1][x]) {
            visit[y+1][x] = true;
            bfs(arr, y + 1, x);
        }
        if (isRng(y - 1, x)&& !visit[y-1][x] ) {
            visit[y-1][x] = true;
            bfs(arr, y - 1, x);
        }
        if (isRng(y, x + 1) && !visit[y][x+1]) {
            visit[y][x+1] = true;
            bfs(arr, y, x + 1);
        }
        if (isRng(y, x - 1) && !visit[y][x-1]) {
            visit[y][x-1] = true;
            bfs(arr, y, x - 1);
        }


        return;
    }

}
