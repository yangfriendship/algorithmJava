package youzheng.algorithm.beakjoon.beakjoon1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.StringTokenizer;

public class beakjoon_3048 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        String[] A = reverse(br.readLine()).split("");
        String[] B = br.readLine().split("");


        int T = Integer.parseInt(br.readLine());
        if (T == 0) {
            for (int i = 0; i < A.length; i++) {
                System.out.printf("%s",A[i]);
            }for (int i = 0; i < B.length; i++) {
                System.out.printf("%s",B[i]);
            }
            return;
        }
        String[] arr = new String[(a+b+50*2)+1];
        int max = (a+b+T*2);
        for (int i = 0; i < a; i++) {
            arr[i*2] =A[i];
        }

        int index = (a-1)*2;
        for (int i = 0 ; i < b; i++) {
            arr[index+1+(i*2)] = B[i];
        }


        int num = T;
        while(T > 0&&T < max+1 && index >=0){

            try{
                arr[index + num*2] = arr[index];
                arr[index] = null;
                index -= 2;
                T--;
            }catch (Exception e){
            break;
            }

        }

        for (int i = 0; i < arr.length; i++) {

            if(arr[i] == null) continue;
            sb.append(arr[i]);
        }


        System.out.println(sb);
    }

    public static String reverse(String str){
        return new StringBuffer(str).reverse().toString();
    }


}
