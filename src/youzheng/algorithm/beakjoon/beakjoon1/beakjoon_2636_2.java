package youzheng.algorithm.beakjoon.beakjoon1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class beakjoon_2636_2 {

    static int n;
    static int m;
    static int cnt;
    static int T = 2;

    static int[][] visit;
    static int[][] arr;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[n][m];
        visit = new int[n][m];
        int turn = 0;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                int value = Integer.parseInt(st.nextToken());
                arr[i][j] = value;

            }
        }
        cnt = getCheeseCnt();
        int answer = cnt;
        while(cnt > 0){
            answer = cnt;
            ++turn;
            sideBfs();
            melt();
        }
        System.out.println(turn);
        System.out.println(answer);
    }

    public static void sideBfs(){
        for (int i = 0; i < arr.length; i++) {
            bfs(i,0);
        }
        for (int i = 0; i < arr.length; i++) {
            bfs(i,m-1);
        }
        for (int i = 0; i < arr[0].length; i++) {
            bfs(0,i);
        }
        for (int i = 0; i < arr[0].length; i++) {
            bfs(n-1,i);
        }
    }

    public static void bfs(int y, int x) {

        if (arr[y][x] == 1) {
            if(isSideCheese(y,x)){
                visit[y][x] = 2;
                return;
            }
        }
        int[] add = new int[]{0, 0, 1, -1};
        for (int i = 0; i < 4; i++) {
            int newY = y+add[i];
            int newX = x+add[3-i];
            if (isRng(newY, newX) && visit[newY][newX]==0) {
                visit[newY][newX] = 1;
                bfs(newY, newX);
            }

        }

    }

    public static int getCheeseCnt() {
        int count = 0;
        for (int i = 0; i <arr.length; i++) {

            for (int j = 0; j < arr[0].length; j++) {
                if(arr[i][j] == 1){
                    count ++;
                }
            }
            
        }
        return count;
    }

    public static boolean isRng(int y , int x){

        if(y < 0 || y>= n || x < 0 || x >= m){
            return false;
        }
        return true;
    }

    public static boolean isSideCheese(int y, int x) {
        int[] add = new int[]{0, 0, 1, -1};
        for (int i = 0; i < 4; i++) {

            if (arr[y + add[i]][x + add[3 - i]] == 0){
                return true;
            }

        }
        return false;
    }

    public static void melt() {
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[0].length; j++) {
                if (visit[i][j] == 2) {
                    arr[i][j] = 0;
                    cnt--;
                }
            }
        }
        visit = new int[n][m];
    }

    public static void printArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.println();
        }

        System.out.println("------------------------");
    }
}
