package youzheng.algorithm.beakjoon.beakjoon1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class beakjoon_14503 {

    static int x;
    static int y;
    static int direction;
    static int cnt = 0;
    static int[][] arr;
    static boolean over = false;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        arr = new int[n][m];

        st = new StringTokenizer(br.readLine()); //로봇 초기화
        y = Integer.parseInt(st.nextToken());
        x = Integer.parseInt(st.nextToken());
        direction = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        } //input Array

        while (!over) {

            print();
            boolean find = false;
            if (arr[y][x]==0){
                clear();
            }

            while (true) {
                while (searchCnt < 4) {    // 좌 후 우 순으로 탐색하고 searchCnt 3회가 되면 AllCrear=true 종료

                    turnLeft();
                    if (hasLaji()) {
                        find = true;
                        searchCnt = 0;
                        break;
                    } else {
                        searchCnt++;
                    }
                }

                if (find) {
                    move();
                    break;
                } else {
                    if (canBack()) {
                        back();
                        break;
                    } else {
                        over = true;
                        System.out.println(cnt);
                        return;
                    }
                }


            }


        }
        System.out.println(cnt);

    }
    public static  boolean isBlock(){
        if(arr[y][x]==1){
            return true;
        }
        return false;
    }

    public static void print() {
        System.out.println("cnt: " + cnt +"d: "+ direction);
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[0].length; j++) {

                if (i == y && j == x) {
                    System.out.printf("%d ", 3);
                } else {
                    System.out.printf("%d ", arr[i][j]);
                }

            }
            System.out.println();
        }

        System.out.println("=================================");

    }

    public static void back() {
        if (direction == 0) {
            down();
        } else if (direction == 1) {
            left();
        } else if (direction == 2) {
            up();
        } else if (direction == 3) {
            right();
        }
    }

    public static boolean canBack() {
        if (direction == 0) {
            up();
            if(isBlock()){
                down();
                return false;
            }
            down();
            return true;
        } else if (direction == 1) {
            right();
            if(isBlock()){
                left();
                return false;
            }
            left();
            return true;
        } else if (direction == 2) {
            down();
            if(isBlock()){
                up();
                return false;
            }
            up();
            return true;
        } else if (direction == 3) {
            left();
            if (isBlock()){
                right();
                return false;
            }
            right();
            return true;
        }
        return true;
    }

    public static boolean hasLaji() {
        if (direction == 0) {
            if (arr[y - 1][x] == 0) {
                return true;
            }

        } else if (direction == 1) {
            if (arr[y][x + 1] == 0) {
                return true;
            }
        } else if (direction == 2) {
            if (arr[y + 1][x] == 0) {
                return true;
            }
        } else if (direction == 3) {
            if (arr[y][x - 1] == 0) {
                return true;
            }
        }
        return false;
    }

    public static void up() {
        y--;
    }

    public static void down() {
        y++;
    }

    public static void right() {
        x++;
    }

    public static void left() {
        x--;
    }

    public static void move() {
        if (direction == 0) {
            up();
        } else if (direction == 1) {
            right();
        } else if (direction == 2) {
            down();
        } else if (direction == 3) {
            left();
        }
    }

    public static void clear() {
        arr[y][x] = 2;
        cnt++;
    }

    public static void turnLeft() {

        if (direction - 1 < 0) {
            direction = 3;
            return;
        }
        direction--;
    }

    public static boolean notBlock(int y, int x) {
        if (arr[y][x] == 1) {
            return false;
        }
        return true;
    }

    static int searchCnt = 0;

    public static boolean searchGarbage() {
        if (direction == 0) {
            if (arr[y][x - 1] == 0) {
                searchCnt = 0;

                return true;
            }

        } else if (direction == 1) {
            if (arr[y - 1][x] == 0) {
                searchCnt = 0;

                return true;
            }
        } else if (direction == 2) {
            if (arr[y][x + 1] == 0) {
                searchCnt = 0;

                return true;
            }
        } else if (direction == 3) {
            if (arr[y - 1][x] == 0) {
                searchCnt = 0;
                return true;
            }
        }
        searchCnt++;
        turnLeft();
        return false;
    }


}
