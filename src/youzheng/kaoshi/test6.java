package youzheng.kaoshi;

import java.util.*;

public class test6 {


    public static void main(String[] args) {

        String[] logs = {"0001 3 95", "0001 5 90", "0001 5 100", "0002 3 95", "0001 7 80", "0001 8 80", "0001 10 90", "0002 10 90", "0002 7 80", "0002 8 80", "0002 5 100", "0003 99 90"};
        solution(logs);

    }

    public static String[] solution(String[] logs) {
        String[] answer = {};

        List<String> students = new ArrayList<>();

        for (int i = 0; i < logs.length; i++) {

            String id = logs[i].substring(0,5);
            if(!students.contains(id)){
                students.add(id);
            }
        }
        int[][] stData = new int[students.size()][2];
        for (int i = 0; i < students.size()-1; i++) {
            String st1 = students.get(i);

            for (int j = 0; j < logs.length; j++) {
                String[] s = logs[j].split(" ");
                int code = Integer.parseInt(s[0]);
                int ques = Integer.parseInt(s[1]);
                int score = Integer.parseInt(s[2]);
                stData[i][0] = ques;
                stData[i][1] = score;



            }

 

        }


        return answer;
    }




}
