package youzheng.algorithm.beakjoon.beakjoon1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class beakjoon_15683 {

    static int n;
    static int m;

    static class Camera {
        int y;
        int x;
        int w;

        public Camera(int y, int x, int w) {
            this.y = y;
            this.x = x;
            this.w = w;
        }
    }

    static List<Camera> cameras;
    static int[][] arr;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[n][m];
        cameras = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {

                arr[i][j] = Integer.parseInt(st.nextToken());
                if (arr[i][j] > 0 && arr[i][j] < 6) {
                    cameras.add(new Camera(i, j, arr[i][j]));
                }
            }
        }
        int[][] copy = copyArr(arr);

        dfs(copy, 0);
        System.out.println(answer);


    }


    static int answer = Integer.MAX_VALUE;

    static void dfs(int[][] arr, int r) {

        if (r > cameras.size() - 1) { // 카메라 x대만큼 탐색을 다 했으니 반환

            int zeroCnt = getZeroCnt(arr);

            if (zeroCnt < answer) {
                answer = zeroCnt;
            }
            arr = null;
            return;
        }
        Camera camera = cameras.get(r);
        int cameraY = camera.y;
        int cameraX = camera.x;
        int w = camera.w;

        if (w == 1) {
            int[][] copy1 = copyArr(arr);
            int d1 = horizontalDown(copy1, cameraY, cameraX);
            dfs(copy1, r + 1);

            int[][] copy2 = copyArr(arr);
            horizontalUp(copy2, cameraY, cameraX);
            dfs(copy2, r + 1);

            int[][] copy3 = copyArr(arr);
            VerticalLeft(copy3, cameraY, cameraX);
            dfs(copy3, r + 1);

            int[][] copy4 = copyArr(arr);
            VerticalRight(copy4, cameraY, cameraX);
            dfs(copy2, r + 1);


        }
        if (w == 2) {

            int[][] copy1 = copyArr(arr);
            horizontalUp(copy1, cameraY, cameraX);
            horizontalDown(copy1, cameraY, cameraX);
            dfs(copy1, r + 1);

            int[][] copy2 = copyArr(arr);
            VerticalRight(copy2, cameraY, cameraX);
            VerticalLeft(copy2, cameraY, cameraX);
            dfs(copy2, r + 1);
        }

        if (w == 3) {

            int[][] copy1 = copyArr(arr);
            horizontalUp(copy1, cameraY, cameraX);
            VerticalRight(copy1, cameraY, cameraX);
            dfs(copy1, r + 1);

            int[][] copy2 = copyArr(arr);
            horizontalUp(copy2, cameraY, cameraX);
            VerticalLeft(copy2, cameraY, cameraX);
            dfs(copy2, r + 1);


            int[][] copy3 = copyArr(arr);
            VerticalLeft(copy3, cameraY, cameraX);
            horizontalDown(copy3, cameraY, cameraX);
            dfs(copy3, r + 1);

            int[][] copy4 = copyArr(arr);
            int i6 = horizontalDown(copy4, cameraY, cameraX);
            int i7 = VerticalRight(copy4, cameraY, cameraX);
            dfs(copy4, r + 1);
        }

        if (w == 4) {
            int[][] copy1 = copyArr(arr);
            int d2 = horizontalUp(copy1, cameraY, cameraY);
            int d3 = VerticalLeft(copy1, cameraY, cameraX);
            int d4 = VerticalRight(copy1, cameraY, cameraX);
            dfs(copy1, r + 1);

            int[][] copy2 = copyArr(arr);
            int e1 = horizontalDown(copy2, cameraY, cameraX);
            int e2 = VerticalLeft(copy2, cameraY, cameraX);
            int e3 = VerticalRight(copy2, cameraY, cameraX);
            dfs(copy2, r + 1);

            int[][] copy3 = copyArr(arr);
            int e4 = horizontalDown(copy3, cameraY, cameraX);
            int e5 = horizontalUp(copy3, cameraY, cameraX);
            int e6 = VerticalRight(copy3, cameraY, cameraX);
            dfs(copy3, r + 1);


            int[][] copy4 = copyArr(arr);
            horizontalDown(copy4, cameraY, cameraX);
            horizontalUp(copy4, cameraY, cameraX);
            VerticalLeft(copy4, cameraY, cameraX);
            dfs(copy4, r + 1);

        }
        if (w == 5) {
            int[][] copy = copyArr(arr);
            horizontalDown(copy, cameraY, cameraX);
            horizontalUp(copy, cameraY, cameraX);
            VerticalLeft(copy, cameraY, cameraX);
            VerticalRight(copy, cameraY, cameraX);
            dfs(copy, r + 1);
        }

    }

    public static int getZeroCnt(int[][] arr) {
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == 0) {
                    cnt++;
                }
            }
        }
        return cnt;
    }

    public static int[][] copyArr(int[][] arr) {
        int[][] copy = new int[arr.length][arr[0].length];

        for (int i = 0; i < arr.length; i++) {
            copy[i] = arr[i].clone();
        }
        return copy;
    }

    public static boolean isRng(int y, int x) {

        if (y < 0 || y >= n || x < 0 || x >= m) {
            return false;
        }
        return true;
    }


    public static int horizontalDown(int[][] arr, int y, int x) {
        int cnt = 0;
        for (int i = y + 1; i < n; i++) {

            if (isRng(i, x)) {    //범위 체크 후
                if (arr[i][x] < 1) { // 0이라면 7(감시)로 바꿈
                    arr[i][x] = 7;
                    cnt++;
                } else if (arr[i][x] == 6) {   //벽이면 더이상 못감, 정지
                    return cnt;
                }
            } else {       //범위가 넘어섰으니 바로 정지
                return cnt; // rang over jiu ting
            }
        }
        return cnt;
    }

    public static int horizontalUp(int[][] arr, int y, int x) {
        int cnt = 0;
        for (int i = y - 1; i >= 0; i--) {

            if (isRng(i, x)) {    //범위 체크 후
                if (arr[i][x] < 1) { // 0이라면 7(감시)로 바꿈
                    arr[i][x] = 7;
                    cnt++;
                } else if (arr[i][x] == 6) {   //벽이면 더이상 못감, 정지
                    return cnt;
                }
            } else {       //범위가 넘어섰으니 바로 정지
                return cnt; // rang over jiu ting
            }
        }
        return cnt;
    }

    public static int VerticalRight(int[][] arr, int y, int x) {
        int cnt = 0;
        for (int i = x + 1; i < m; i++) {

            if (isRng(y, i)) {    //범위 체크 후
                if (arr[y][i] < 1) { // 0이라면 7(감시)로 바꿈
                    arr[y][i] = 7;
                    cnt++;
                } else if (arr[y][i] == 6) {   //벽이면 더이상 못감, 정지
                    return cnt;
                }
            } else {       //범위가 넘어섰으니 바로 정지
                return cnt; // rang over jiu ting
            }
        }

        return cnt;
    }

    public static int VerticalLeft(int[][] arr, int y, int x) {
        int cnt = 0;
        for (int i = x - 1; i >= 0; i--) {

            if (isRng(y, i)) {    //범위 체크 후
                if (arr[y][i] < 1) { // 0이라면 7(감시)로 바꿈, 카메라가 아니고 벽도 아닌
                    arr[y][i] = 7;
                } else if (arr[y][i] == 6) {   //벽이면 더이상 못감, 정지
                    return cnt;
                }
            } else {       //범위가 넘어섰으니 바로 정지
                return cnt; // rang over jiu ting
            }
        }
        return cnt;
    }

}
