package youzheng.algorithm.beakjoon.beakjoon1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class beakjoon_2234 {

    static boolean[][] visit;
    static int[][] arr;
    static int max = 0;
    static int roomNum=0;
    static int roomCnt = 0;
    static List<Integer> list = new ArrayList<>();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        arr = new int[n][m];
        visit = new boolean[n][m];
        /*  서쪽에 벽이 있으면 1
         *   북쪽에 벽이 있으면 2
         *   동쪽에 벽이 있으면 4
         *   남쪽에 벽이 있으면 8
         *  배열 방을 이동할 때, direction을 주므로서
         * */

        for (int i = 0; i < arr.length; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        st= null;

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {
                if(!visit[i][j]){
                    dfs(i,j);
                    list.add(roomCnt);
                    roomCnt=0;
                }
            }

        }

        for (int i = 0; i < roomNum; i++) {
            System.out.printf("%d ", list.get(i));
        }

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[0].length; j++) {

                if(isRng(i,j+1) && arr[i][j+1] != arr[i][j]){
                    if(list.get(arr[i][j+1]) + list.get(arr[i][j]) > max ){
                        max = list.get(arr[i][j+1]) + list.get(arr[i][j]);
                    }
                }
                if(isRng(i,j-1) && arr[i][j-1] != arr[i][j]){
                    if(list.get(arr[i][j-1]) + list.get(arr[i][j]) > max ){
                        max = list.get(arr[i][j-1]) + list.get(arr[i][j]);
                    }
                }

                if(isRng(i+1,j) && arr[i+1][j] != arr[i][j]){
                    if(list.get(arr[i+1][j]) + list.get(arr[i][j]) > max ){
                        max = list.get(arr[i+1][j]) + list.get(arr[i][j]);
                    }
                }
                if(isRng(i-1,j) && arr[i-1][j] != arr[i][j]){
                    if(list.get(arr[i-1][j]) + list.get(arr[i][j]) > max ){
                        max = list.get(arr[i-1][j]) + list.get(arr[i][j]);
                    }
                }
            }
        }

        System.out.println(list.size());
        Collections.sort(list);
        System.out.println(list.get(list.size()-1));
        System.out.println(max);
    }


    public static void dfs(int y, int x) {

        visit[y][x] = true;
        roomCnt++;

        if (isRng(y, x - 1) && !visit[y][x - 1] && !isWall(y,x,1)) { // left
            dfs(y, x - 1);
        }
        if (isRng(y - 1, x) && !visit[y - 1][x]&& !isWall(y,x,2)) { // up
            dfs(y - 1, x);
        }
        if (isRng(y, x + 1) && !visit[y][x + 1]&& !isWall(y,x,3)) { // right
            dfs(y, x + 1);
        }
        if (isRng(y + 1, x) && !visit[y + 1][x]&& !isWall(y,x,4)) { // down
            dfs(y + 1, x);
        }

        arr[y][x] = list.size();
    }

    private static boolean isRng(int y, int x) {
        if (y < 0 || x < 0 || y >= arr.length || x >= arr[0].length) {
            return false;
        }
        return true;
    }

    private static boolean isWall(int y, int x, int dir) { //left=1,up=2,right=3,down=4 , dir= 체크할 방향

        long room = arr[y][x];
        long shift = 1L << (dir - 1);
        long result = room & shift;
        if (result == shift) {
            return true;
        }
        return false;
    }

}
