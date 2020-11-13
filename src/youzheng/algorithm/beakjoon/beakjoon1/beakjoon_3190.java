package youzheng.algorithm.beakjoon.beakjoon1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class beakjoon_3190 {
    static int headX = 1;   // 뱀은 배열 1,1에서 시작하므로 바로 초기화
    static int headY = 1;
    static int direction = 1; //0 위 , 1 오른쪽, 2 아래쪽 , 3, 왼쪽
    static int n =0; 
    static int k =0;
    static List<int[]> register = new LinkedList<>();   // 뱀의 몸통의 x,y좌표 값을 저장하기 위해서 사용했다.
    static  int[][] arr;                                // Game board
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));



         n = Integer.parseInt(br.readLine());
       arr = new int[n+1][n+1];
         k = Integer.parseInt(br.readLine());
        StringTokenizer st = null;
        for (int i = 0; i < k; i++) {
            st = new StringTokenizer(br.readLine());
            int y = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            arr[y][x] = 1;
        }


        List<int[]> comms = new LinkedList<>();
        k = Integer.parseInt(br.readLine());
        for (int i = 0; i < k; i++) {
            st = new StringTokenizer(br.readLine());
            int s =Integer.parseInt(st.nextToken());
            int d = (st.nextToken()).equals("D") ? 1 : -1;
            comms.add(new int[]{s,d});
        }

        int time = 0;
        register.add(new int[]{1,1});
        while(true){


            time ++;
            move();
            if(comms.size()>0){             //입력받은 명령을 담은 List에서 명령의시간과 현재 시간이 같다면 방향을 회정
                if(time == comms.get(0)[0]){    //x초의 행동이 끝난 후, x초의 명령을 수행 -> 선 move() 후 방향전환
                    if(comms.get(0)[1] == 1){
                        comms.remove(0);
                        turnRight();
                    }else if(comms.get(0)[1] == -1){
                        comms.remove(0);
                        turnLeft();
                    }
                }
            }


            if (isOver()){      //게임종료 조건을 체크한다.
                break;
            }
            if (hasApple(arr)){ // 사과가 있느냐?
                eatApple(); //있다면 -> 꼬리는 건들지말고 머리부분만 몸통에 추가한다.
            }else {
                notApple(); //고리를 당겨준다
            }





        }

        System.out.println(time);

    }

    private static boolean hasApple(int[][] arr) {
        if (arr[headY][headX] ==1){
            return true;
        }
        return false;
    }

    public static void eatApple(){
        register.add(0, new int[]{headY, headX});
        arr[headY][headX] = 2;

    }
    public static void notApple(){
        pullTail();
        arr[headY][headX] = 2;
    }

    public static void pullTail(){
        int[] remove = register.remove(register.size() - 1);
        register.add(0,new int[]{headY,headX});
        arr[remove[0]][remove[1]] = 0;
    }

    public static void move(){
        if(direction==1){
            toRight();
            return;
        }else if(direction==2){
            toBottom();
        }else if(direction==3){
            toLeft();
        }else if(direction==0){
            toTop();
        }
    }


    public static void toBottom(){
        headY ++;
    }
    public static void toTop(){
        headY --;
    }
    public static void toRight(){
        headX ++;
    }
    public static void toLeft(){
        headX --;
    }


    public static void turnRight(){
        direction +=1;
        if(direction>3){
            direction=0;
        }
    }

    public static void turnLeft(){
        direction -=1;
        if(direction<0){
            direction=3;
        }
    }

    public static boolean isOver(){
        if(headX > n || headX <1 || headY >n || headY < 1){
            return true;
        }

        if(arr[headY][headX] == 2){
            return true;
        }

        return false;
    }

    public static void printMap(int[][] arr){

        for (int i = 1; i < arr.length ; i++) {

            for (int j = 1; j < arr[0].length; j++) {
                System.out.printf("%d",arr[i][j]);
            }
            System.out.println();
        }
        System.out.println("============================");
    }
    static int  cnt = 0;
    public static void printSnake(int[][] arr){

        int[][] brr = new int[arr.length][arr[0].length];
        Iterator<int[]> it = register.iterator();

        while (it.hasNext()) {
            int[] next = it.next();
            int y = next[0];
            int x = next[1];
            brr[y][x] = 1;
        }

        System.out.println("============="+cnt +"==========");
        cnt ++;
        for (int i = 1; i < arr.length; i++) {

            for (int j = 1; j < arr[0].length; j++) {
                if(arr[i][j]==1){
                    System.out.print(2);
                }else{
                    System.out.print(brr[i][j]);
                }
            }
            System.out.println();

        }

    }


}
