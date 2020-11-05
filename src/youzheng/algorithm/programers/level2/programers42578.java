package youzheng.algorithm.programers.level2;

import java.io.BufferedReader;
import java.util.*;

public class programers42578 {

    public static void main(String[] args) {

        String[][] input = {{"yellow_hat", "headgear"},
                           {"blue_sunglasses", "eyewear"},
                             {"green_turban", "headgear"}};

        String[][] input2 = 	{{"crow_mask", "face"}
        , {"blue_sunglasses", "face"}
        , {"smoky_makeup", "face"}};

        int result = solution(input);
//        int result2 = solution(input2);
        System.out.println(result);

//        System.out.println(result2);
    }

    public static int solution(String[][] clothes) {
        int answer = 0;

        Map<String,Integer> map = new HashMap<>();
        int cnt = 0;
        int cnt2 = 0;
        for (int i = 0; i < clothes.length; i++) {

            String input = clothes[i][1];
            cnt ++;
            if (map.containsKey(input)){
                map.put(input,map.get(input)+1);
            }else {
                map.put(input,1);
            }

        }
        Set<String> strings = map.keySet();
        answer = 1;

        for (String key : strings) {

            answer *= map.get(key)+1;
        }

        return answer-1;
    }

}
