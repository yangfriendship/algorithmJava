package youzheng.algorithm.beakjoon.beakjoon1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class beakjoon_14569 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        long[] subjects = new long[n];
        //과목입력 받기
        for (int i = 0; i < n; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine());
            subjects[i] = 0L;
            int k = Integer.parseInt(st.nextToken());
            while(st.hasMoreTokens()){

                long shift = getbit(Integer.parseInt(st.nextToken()));

                subjects[i] = shift | subjects[i] ;
            }
        }

        int m = Integer.parseInt(br.readLine());
        long[] students = new long[m];

        for (int i = 0; i < m; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int k = Integer.parseInt(st.nextToken());
            long student = 0L;
            while(st.hasMoreTokens()){
                long shift = getbit(Integer.parseInt(st.nextToken()));
                student = shift |student  ;
            }

            for (int j = 0; j < n; j++) {
                long subject = subjects[j];
                long result = student & subject ;
                if (subject == result){
                    students[i] ++;
                }
            }

        }
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
    }

    public static long getbit(int time) {

        /*
        * 1을 비트쉬프느하면 안된다.
        * 1L을해야 long으로 인식하고 그냥 1을 밀어버리면 int(2^32)를 까지 나타내기에
        * 수업번호 32번넘어가면 초기화된다.
        *
        * */

        return 1L << time - 1;
    }


}
