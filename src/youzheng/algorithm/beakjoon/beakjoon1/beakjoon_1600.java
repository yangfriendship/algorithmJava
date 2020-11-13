package youzheng.algorithm.beakjoon.beakjoon1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class beakjoon_1600 {

    static int n;
    static int m ;
    static int[][] arr;

    static class Data {
        int x;
        int y;
        int jump;
        int cnt;

        public Data(int x, int y, int jump, int cnt) {
            this.x = x;
            this.y = y;
            this.jump = jump;
            this.cnt = cnt;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int k = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        arr = new int[n][m];
        st = null;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        br.close();


        System.out.println(bfs(k));



    }

//    public static void printArr() {
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[0].length ; j++) {
//                System.out.printf("%d ",arr[i][j]);
//            }
//            System.out.println();
//        }
//    }

    public static boolean isRng(int y , int x){
        if(y < 0 || y >= n || x <0 || x>= m || arr[y][x] == 1 ){
            return false;
        }
        return  true;
    }

    public static int bfs(int k){

        Queue<Data> que = new LinkedList<>();


        que.add(new Data(0,0,k,0));

        boolean[][][] visit = new boolean[n][m][k+1]; //goal은 +1 배열의 길이
        visit[0][0][k] = true;
        while (!que.isEmpty()) {
            Data d = que.poll();
            int dY = d.y;
            int dX = d.x;
            int dJump = d.jump;
            int dCnt = d.cnt;

            if (dY == n-1 && dX == m-1) {
                    return dCnt;
            }
            int[] add = new int[]{0, 0, 1, -1};
            int[] horseX = new int[]{1, 2, 2, 1, -1, -2, -2, -1};
            int[] horseY = new int[]{-2, -1, 1, 2, 2, 1, -1, -2};
            for (int i = 0; i < 4; i++) {
                int addX = dX + add[i];
                int addY = dY + add[3 - i];
                if (isRng(addY, addX) && !visit[addY][addX][dJump]) {
                    visit[addY][addX][dJump] = true;

                    que.add(new Data(addX,addY,dJump,dCnt+1));

                }
            }
            if (dJump > 0) {
                for (int i = 0; i < 8; i++) {
                    int addY = dY + horseY[i];
                    int addX = dX + horseX[i];
                    int newJump = dJump-1;
                    if (isRng(addY, addX) && !visit[addY][addX][dJump]) {
                        visit[addY][addX][newJump] = true;

                        que.add(new Data(addX,addY,newJump,dCnt+1));
                    }

                }
            }


        }
        return -1;
    }

}
