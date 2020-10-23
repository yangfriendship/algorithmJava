package youzheng.algorithm.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;


public class beakjoon_1463 {

//    X가 3으로 나누어 떨어지면, 3으로 나눈다.
//    X가 2로 나누어 떨어지면, 2로 나눈다.
//    1을 뺀다.

    static int answer = Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        solve(n , 0);

        System.out.println(answer);

    }//main

    private static void solve(int n, int i) {

        Queue<Integer> que = new ArrayDeque<>();
        Queue<Integer> visit = new ArrayDeque<>();


        que.add(n);
        visit.add(0);
        while(!que.isEmpty()){

            int qd = que.poll();
            if(qd == 1){
                answer = visit.poll();
                return;
            }

            int visitCnt = visit.poll();

            if (qd >=3 && qd%3 == 0){

                que.add(qd/3);
                visit.add(visitCnt+1);

            }
            if (qd >=2 && qd%2 == 0){

                que.add(qd/2);
                visit.add(visitCnt+1);


            }

            if (qd > 1 ){

                que.add(qd-1);
                visit.add(visitCnt+1);


            }

        }

    }


}
