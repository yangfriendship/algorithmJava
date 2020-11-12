package youzheng.algorithm.beakjoon.beakjoon1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class beakjoon_3190 {
    static int headX = 1;
    static int headY = 1;
    static int direction = 1; //0 1 2 3 시계방향
    static int n =0;
    static int k =0;
    static List<int[]> register = new LinkedList<>();
    static  int[][] arr;
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

        printMap(arr);
        int time = 0;
        register.add(new int[]{1,1});
        while(true){

            if(time == comms.get(0)[0]){
                if(comms.get(0)[1] == 1){
                    turnRight();
                }else if(comms.get(0)[1] == -1){
                    turnLeft();
                }
            }

            move();
            printSnake(arr);
            time ++;

            if (isOver()){
                break;
            }
            if (hasApple(arr)){ // 사과가 있음
                eatApple();
            }else {
                notApple();
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
        }else if(direction==4){
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

                System.out.print(brr[i][j]);
            }
            System.out.println();

        }

    }


}
