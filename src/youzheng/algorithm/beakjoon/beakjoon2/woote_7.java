package youzheng.algorithm.beakjoon.beakjoon2;

import java.util.Stack;

public class woote_7 {
    static Stack<Character> stk;
    public static void main(String[] args) {
        String str = "bbrownn";
        stk = new Stack<>();
        int index=0;
        while(index < str.length()){
            char c = str.charAt(index);
            if(stk.isEmpty()){
                stk.add(c);
            }else{
             isDuplicate(c);
            }
            index ++;
        }

        stk.forEach(c-> {
            System.out.printf("%c",c);
        });

    }

    public static void isDuplicate(char c){
        if(stk.peek()!= c){
            stk.add(c);
        }else{
            stk.pop();
        }
    }

}
