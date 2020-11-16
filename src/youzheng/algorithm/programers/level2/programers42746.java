package youzheng.algorithm.programers.level2;

import java.util.Arrays;
import java.util.Comparator;

public class programers42746 {

    public static void main(String[] args) {

//        int[] input = {6,10,2};
        int[] input = {3, 30, 34, 5, 9};


        String solution = solution(input);
        System.out.println(solution);

    }

    public static String solution(int[] numbers) {

            String[] arr = new String[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            arr[i] = String.valueOf(numbers[i]);
        }
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {

                return (o2+o1).compareTo(o1+o2);
            }
        });
        StringBuffer sb = new StringBuffer();
        StringBuffer zero = new StringBuffer();
        for (int i = 0; i < arr.length; i++) {

            if(arr[i].charAt(0)=='0'){
            zero.append(arr[i]);
            }else{
                sb.append(arr[i]);
            }

        }
        sb.append(zero);

        String answer = new String(sb);
        if(answer.charAt(0)== '0'){ // input에 0만 들어있던 것이다! 아마 000000이런 문자열이 만들어져 있을 것
            return "0";
        }

            return answer;
    }











//    static long max = Integer.MIN_VALUE;
//    public static void bfs(int[] numbers,boolean[] visit, int r, int num, int index) {
//
//        if(r == numbers.length){
//            if(num > max){
//                max = num;
//            }
//            return;
//        }
//
//        for (int i = 0; i < numbers.length ; i++) {
//
//            if(!visit[i]){
//                visit[i] = true;
//                bfs(numbers,visit,r+1,combine(num,numbers[i]),i);
//                visit[i] = false;
//            }
//        }
//    }
//
//    public static int combine(int a, int b){
//
//        int result = 0;
//
//        int length = String.valueOf(b).length();
//
//        a = a * (int)Math.pow(10,length);
//
//        return a+b;
//    }

}
