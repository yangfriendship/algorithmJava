package youzheng.algorithm.beakjoon.beakjoon1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class beakjoon_1062 {
    static int max = Integer.MIN_VALUE;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); //남극 총 단어의 개수
        int k = Integer.parseInt(st.nextToken()); //k개의 글자를 가르칠 수 있다.
        bitArr = new Long[n];

        if(k==26){
            System.out.println(n);
            return;
        }

        List<Integer> list = new ArrayList<>();

        long[] words = new long[n];
        int length = k - 5;

        for (int i = 0; i < n; i++) {//남극의 총 단어를 입력받는다.

            String input = br.readLine();
            input =  input.replaceAll("[antic]",""); // 앞부분 anti와 뒷부분 공통 단어를 제거함
            long bitNum = toBit(input);     //입력받은 단어를 숫자로 변환해 비트쉬프트를 해준다.
            words[i] = bitNum;
            for (int j = 0; j < Long.toBinaryString(bitNum).length(); j++) {  // 26번을 확인할 필요없이 word의 이진수의 길이만큼 체크
                long target = (bitNum >> j) & 1L;
                if(target == 1 && !list.contains(j)){
                    list.add(j);
                }
            }
        }

        if(k == 5 &&list.size()==0){    // 기본 알파벳으로 구성된 단어도 있을 것이다.
            System.out.println(n);
            return;
        }
        if(k < 6){
            System.out.println(0); // a n t i c  다섯개는 가르쳐야 기본 단어
            return;
        }



        boolean[] visit = new boolean[26];
        bfs(words,list,visit,0,length,0,0);

        System.out.println(max);
    }

    static Long[] bitArr;

    public static void bfs(long[] words, List<Integer> list, boolean[] visit , int r, int length, long bit,int start){

        if(bit != 0){
            int cnt = 0;
            for (int i = 0; i < words.length; i++) {
                long word = words[i];
                long jieguo = word & bit;

                if(jieguo == word){
                    cnt ++;
                }
            }
            if(cnt > max){
                max = cnt;

            }

        }

        if(r == length){
            return;
        }

        for (int i = start; i < list.size(); i++) {
            long listBit = 1L << list.get(i);
            if(!visit[list.get(i)]){
                visit[list.get(i)] = true;
                bfs(words, list, visit, r+1, length, bit | listBit,i);
                visit[list.get(i)] = false;
            }

        }

    }


    public static long toBit(String str){

        long bit = 0L;

        for (int i = 0; i < str.length(); i++) {
            long shift = (str.charAt(i)-97);
            bit = bit | 1L << shift;
        }

        return bit;
    }

}


