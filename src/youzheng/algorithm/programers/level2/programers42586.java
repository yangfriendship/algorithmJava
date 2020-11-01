package youzheng.algorithm.programers.level2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class programers42586 {

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] progresses = {93, 30, 55};
        int[] speeds     = {1, 30,5};

        int[] solution = solution(progresses, speeds);

        for (int i = 0; i < solution.length; i++) {
            System.out.println(solution[i]);
        }



    }


        public static int[] solution(int[] progresses, int[] speeds) {
            int[] answer ;
            List<Integer> list = new ArrayList<>();
            int[] inc = new int[speeds.length];
            int headIndex = 0;
            int day = 1;
            while(headIndex < speeds.length){
                int cnt = 0;
                int head = progresses[headIndex];
                int lack = 100 - head;
                int speed = speeds[headIndex];
                day = lack % speed == 0 ? lack/ speed : (lack/ speed)+1;

                for (int i = headIndex; i < progresses.length; i++) {
                    progresses[i] += (speeds[i]*day);
                }

                for (int i = headIndex; i < progresses.length; i++) {
                    if(progresses[i] >= 100){
                        headIndex ++;
                        cnt ++;
                    }else {
                        break;
                    }

                }
                list.add(cnt);



            }

            answer = new int[list.size()];

            for (int i = 0; i < list.size(); i++) {
                answer[i] = list.get(i);
            }
            return answer;
        }
}
