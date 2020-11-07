package youzheng.kaoshi;

import java.util.Arrays;

public class test2 {

    public static void main(String[] args) {

        String st = "987987";
        String op = "-";

        long[] solution = solution(st, op);

        Arrays.stream(solution).forEach(num ->{
            System.out.printf("%d ",num);
        });


    }

    public static long[] solution(String s, String op) {
        long[] answer = {};
        answer = new long[s.length()-1];

        for (int i = 0; i < s.length()-1; i++) {

            long left = Long.parseLong(s.substring(0,i+1));
            long right = Long.parseLong(s.substring(i+1,s.length()));

            long result = calc(left,op,right);
            answer[i] = result;
        }


        return answer;
    }

    private static long calc(long left, String op, long right) {

        if(op.equals("+")){
            return left+ right;
        }else if(op.equals("-")){
            return left - right;
        }else{
            return left * right;
        }

    }

}
