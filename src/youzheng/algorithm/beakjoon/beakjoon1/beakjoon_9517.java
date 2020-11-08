package youzheng.algorithm.beakjoon.beakjoon1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class beakjoon_9517 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int k = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        int curr = k;
        int count = 210;
        String[] arr = new String[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = br.readLine();
        }

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(arr[i]);
            int time = Integer.parseInt(st.nextToken());
            String result = st.nextToken();

            if(result.equals("T")){
                count -= time;
                if(count <=0){
                    break;
                }
                curr = move(curr);
                continue;
            }else {
                count -= time;
                if(count <=0){
                    break;
                }
                continue;
            }

        }

        System.out.println(curr);
    }

    public static int move(int curr){
        if(curr+1 <= 8){
            return curr+1;
        }
        return 1;
    }
}
