package youzheng.algorithm.beakjoon.beakjoon1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class beakjoon_15787 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());   // 기차의 개수
        int m = Integer.parseInt(st.nextToken());   // 명령의 개수

        long[] trains = new long[n+1]; // int형으로 충분하지만 혹시 몰라서 long을 사용함

        for (int i = 0; i < m; i++) { // 명령 m개 들어온다

            st = new StringTokenizer(br.readLine());
            int comm = Integer.parseInt(st.nextToken());    // 명령의 종류
            int num = Integer.parseInt(st.nextToken());     // 기차의 번호
            int seatNum = 0;                                // 좌석번호
            if(st.hasMoreTokens()){
                seatNum = Integer.parseInt(st.nextToken());
            }

            if(comm == 1){  // 명령1 : num번 기차의 seatNum에 손님이 탄다.

                trains[num] = trains[num] | 1L << (seatNum);

                continue;
            }else if(comm == 2){ //명령2 : num번 기차의 seatNum의 손님이 내린다
                trains[num] = trains[num] & ~(1<<(seatNum));
                continue;
            }else if(comm== 3){ // //명령3 : num번 기차의 손님이 전부 뒤로 한 칸씩 간다. 2
                trains[num] = trains[num] << 1L;
                trains[num] = trains[num] & ~(1L << 21);
            }else if(comm ==4){ //명령3 : num번 기차의 손님이 전부 앞 한 칸씩 간다.
                trains[num] = trains[num] >> 1L;
                trains[num] = trains[num] & ~1L;
            }

        }

        Set<Long> set = new HashSet<>(); //중복허용 안하는 set을 이용해서 중복을 걸러줬다.

        for (int i = 1; i < trains.length; i++) {
            set.add(trains[i]);
        }
        set.remove(0);  // 손님이 전혀 없는 기차(0)은 통과할 필요가 없으니 버려준다.
        System.out.println(set.size());
    }
}
