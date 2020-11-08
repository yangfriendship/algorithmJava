package youzheng.algorithm.beakjoon.beakjoon1;

import jdk.internal.util.xml.impl.Input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class beakjoon_1063 {

    static final int MAX_RANGE = 8;
    static final int MIN_RANGE = 1;

    static int kingX;
    static int kingY;
    static int stoneX;
    static int stoneY;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] arr = new int[9][9];

        StringTokenizer st = new StringTokenizer(br.readLine());
        String king = st.nextToken();   //시작 킹 위치
        kingX = ((int)king.charAt(0))-64;
        kingY = Integer.parseInt(king.substring(1,2));
        String stone = st.nextToken();
        stoneX = ((int)stone.charAt(0))-64;
        stoneY = Integer.parseInt(stone.substring(1,2));
        int n = Integer.parseInt(st.nextToken()); // 턴

        for (int i = 0; i < n; i++) {
            String comm = br.readLine();
            move(comm);
        }


        System.out.printf("%c%d\n",(char)(kingX+64),kingY);
        System.out.printf("%c%d",(char)(stoneX+64),stoneY);


    }

    public static void printXY(String comm){
        System.out.printf("king x: %d , y: %d ",kingX,kingY);
        System.out.printf(" stone x: %d , y: %d \t comm: %s \n",stoneX,stoneY,comm);
    }

    private static void move(String comm) {

        switch (comm){

            case "R" :      // 오른쪽
                if(isRng(kingX+1,kingY)){
                    if(exist(kingX+1,kingY)){
                        if(isRng(stoneX+1,stoneY)){
                            kingX++; stoneX++;
                        }else {
                            return;
                        }
                    }else {
                        kingX+=1;
                    }

                }
                return;
            case "L" :      // 왼쪽
                if(isRng(kingX-1,kingY)){
                    if(exist(kingX-1,kingY)){
                        if(isRng(stoneX-1,stoneY)){
                            kingX--; stoneX--;
                        }else {
                            return;
                        }
                    }else {
                        kingX--;
                    }

                }
                return;
            case "B" :      // 아래로
                if(isRng(kingX,kingY-1)){
                    if(exist(kingX,kingY-1)){
                        if(isRng(stoneX,stoneY-1)){
                            kingY--;
                            stoneY--;
                        }else {
                            return;
                        }
                    }else {
                        kingY--;
                    }

                }
                return;
            case "T" :      //위로
                if(isRng(kingX,kingY+1)){
                    if(exist(kingX,kingY+1)){
                        if(isRng(stoneX,stoneY+1)){
                            kingY++; stoneY++;
                        }else {
                            return;
                        }
                    }else {
                        kingY++;
                    }

                }
                return;
            case "RT" :      //오른쪽 위 대각선
                if(isRng(kingX+1,kingY+1)){
                    if(exist(kingX+1,kingY+1)){
                        if(isRng(stoneX+1,stoneY+1)){
                            kingX++; kingY++;
                            stoneX++; stoneY++;
                        }else {
                            return;
                        }
                    }else {
                        kingX++; kingY++;
                    }

                }
                return;
            case "LT" :      //왼쪽 위 대각선
                if(isRng(kingX-1,kingY+1)){
                    if(exist(kingX-1,kingY+1)){
                        if(isRng(stoneX-1,stoneY+1)){
                            kingX--; kingY++;
                            stoneX--; stoneY++;
                        }else {
                            return;
                        }
                    }else {
                        kingX--; kingY++;
                    }

                }
                return;
            case "RB" :      //오른쪽 아래 대각선
                if(isRng(kingX+1,kingY-1)){
                    if(exist(kingX+1,kingY-1)){
                        if(isRng(stoneX+1,stoneY-1)){
                            kingX++; kingY--;
                            stoneX++; stoneY--;
                        }else {
                            return;
                        }
                    }else {
                        kingX++; kingY--;
                    }

                }
                return;
            case "LB" :      //왼쪽 아래 대각선
                if(isRng(kingX-1,kingY-1)){
                    if(exist(kingX-1,kingY-1)){
                        if(isRng(stoneX-1,stoneY-1)){
                            kingX--; kingY--;
                            stoneX--; stoneY--;
                        }else {
                            return;
                        }
                    }else {
                        kingX--; kingY--;
                    }

                }
                return;

        }


    }

    private static boolean exist(int kingX, int kingY) {

        if(kingX == stoneX && kingY == stoneY){
            return true;
        }

        return false;
    }

    private static boolean isRng(int x, int y){

        if(x >=1 && x <= MAX_RANGE && y>= 1 && y <= MAX_RANGE){
            return true;
        }
        return false;
    }


}
