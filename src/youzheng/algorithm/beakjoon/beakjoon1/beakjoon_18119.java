package youzheng.algorithm.beakjoon.beakjoon1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class beakjoon_18119 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuffer sb = new StringBuffer();
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        long[] words = new long[n];
        long remember = 0;      //현재 내가 알고있는 글자를 체크
        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            long word = 0;
            for (int j = 0; j < input.length(); j++) {
                int ask = input.charAt(j) - 97;
                long shift = 1L << (ask);      // 입력받은 단어를 비트로 표현한 값
                word = word | shift;
            }
            words[i] = word;                    // 단어가 무슨 글자로 이루어져있는지 저장
            remember = remember | word;         //기억하는 알파벳 추가
        }
        for (int i = 0; i < m; i++) {

            st = new StringTokenizer(br.readLine());
            int comm = Integer.parseInt(st.nextToken());    //기억/까먹을 나타냄 1,2
            String alp = st.nextToken();
            long bit = 1L << (alp.charAt(0) - 97);
            if (comm == 2) { // 기억함
                remember = remember | bit;
            }
            if (comm == 1) {  //까먹음
                remember = remember & ~bit; //
            }
            int cnt = 0;
            for (int j = 0; j < words.length; j++) {
                long word = words[j];
                long result = word & remember;
                if (result == word) {
                    cnt++;
                }
            }                           //현재 기억하고 있는 글자(remember)과 외웠던 단어(words)를 확인함.
            sb.append(cnt + "\n");
        }


        System.out.println(sb);
    }
}
