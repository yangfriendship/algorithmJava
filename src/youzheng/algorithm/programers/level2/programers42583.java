package youzheng.algorithm.programers.level2;

import java.util.ArrayDeque;
import java.util.Queue;

public class programers42583 {

    public static void main(String[] args) {

        int bridge_length = 2;
        int weight = 10;
        int[] truck_weights = {7, 4, 5, 6};
        int result = solution(bridge_length, weight, truck_weights);
        System.out.println(result);


    }

    public static int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;

        Queue<Integer> que = new ArrayDeque<>();
        int now = 0;
        int curr = 0;
        int nowTruack = 0;
        int time = 0;

        for (int i = 0; i < truck_weights.length; i++) {

            while (true) {
                int truck = truck_weights[i];
                if (que.isEmpty()) {
                    que.add(truck);
                    now += truck;
                }else if(now == weight){
                    now -= truck;
                }else {

                }
            }


        }


        return answer;
    }


}
