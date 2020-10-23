package youzheng.algorithm.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class beakjoon_14888 {

    static int max = Integer.MIN_VALUE;
    static int min = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());

        String[] comm;
        StringBuffer sb = new StringBuffer();

        String[] alp = {"a", "b", "c", "d"};
        for (int i = 0; i < 4; i++) {
            String value = alp[i];
            int repeatCnt = Integer.parseInt(st.nextToken());

            for (int j = 0; j < repeatCnt; j++) {
                sb.append(value);
            }
        }
        String input =new String(sb);
        System.out.println("input: "+input);
        comm = (input).split("");
        System.out.println(comm.length+"comm.length");
        boolean[] visit = new boolean[comm.length];
        int sum = arr[0];
        bfs(arr, comm, visit, 0, sum);

        System.out.println(max);
        System.out.println(min);
    }

    private static void bfs(int[] arr, String[] comm, boolean[] visit, int r, int sum) {

        if (r == comm.length) {
            System.out.println("r : "+ r);
            if (sum > max) {
                max = sum;
            }
            if (sum < min) {
                min = sum;
            }
            System.out.println("perfect");
            return;
        }
        if (r > comm.length) return;

        for (int i = 0; i < comm.length; i++) {
            if (!visit[i]) {
                int value = arr[r+1];
                visit[i] = true;
                if(r==0){
                    sum = arr[0];
                }
                System.out.printf("sum : %d, value : %d, comm : %s \n",sum,value,comm[i]);
                switch (comm[i]) {
                    case "a":
                        sum += value;
                        break;
                    case "b":
                        sum -= value;
                        break;
                    case "c":
                        sum *= value;
                        break;
                    case "d":
                        sum /= value;
                        break;
                }

                bfs(arr, comm, visit, r + 1, sum);

                visit[i] = false;
            }
        }


    }//bfs


}
