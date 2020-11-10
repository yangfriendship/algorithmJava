package youzheng.algorithm.beakjoon.beakjoon1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class beakjoon_2980 {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());
        int time = 0;

        int[][] arr = new int[n + 1][3]; // 0:신호등위치 , //1: 빨간불 // 2: 녹색불 지속시간

        for (int i = 0; i < n; i++) {

            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
            arr[i][2] = Integer.parseInt(st.nextToken());
        }
        arr[n][0] = l;
        for (int i = 0; i < arr.length; i++) {
            int d = i == 0 ? arr[i][0] : (arr[i][0] - arr[i - 1][0]);

            time += d;

            int wait = getWaitTime(time, arr[i]);

            time += wait;
        }

        System.out.println(time);


    }

    private static int getWaitTime(int time, int[] arr) {

        int red = arr[1];
        int blue = arr[2];
        int wait ;
        if (red == 0) {
            return 0;
        }

        wait =time % (red + blue);
        if(wait <= red){
            return Math.abs(wait - red);
        }

        return 0;


    }

}
