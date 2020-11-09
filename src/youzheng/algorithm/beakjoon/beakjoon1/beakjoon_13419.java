package youzheng.algorithm.beakjoon.beakjoon1;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class beakjoon_13419 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());




        while(T-- > 0 ){
            String str = br.readLine();

            if(str.length()==1){
                bw.write(str.charAt(0));
                bw.newLine();
                bw.write(str.charAt(0));
                bw.newLine();
                continue;
            }

            if(str.length()>2){
                str = str+str;
            }
            for (int i = 0; i < 2; i++) {
                Set<Character> set = new HashSet<>();

                for (int j = i; j < str.length(); j+=2) {
                    char c = str.charAt(j);
                    if(set.add(c)){
                        bw.write(c);
                    }else{
                        break;
                    }

                }
                bw.newLine();

            }


        }

        bw.flush();
        bw.close();
        br.close();




    }

}
