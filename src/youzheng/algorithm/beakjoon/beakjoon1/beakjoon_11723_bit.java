package youzheng.algorithm.beakjoon.beakjoon1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class beakjoon_11723_bit {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st ;

        int T = Integer.parseInt(br.readLine());
        int bitmask = 0;
        StringBuffer sb = new StringBuffer();
        while(T-- > 0) {
            st =  new StringTokenizer(br.readLine());
            String comm = st.nextToken();
            int num =0;
            if(!comm.equals("all") && !comm.equals("empty")){
               num = Integer.parseInt(st.nextToken());
            }
            switch (comm){
                case "add" :
                    bitmask = bitmask | 1 << (num -1);
                    continue;
                case "remove":
                    bitmask = bitmask & ~(1 << (num-1));
                    continue;
                case "check":
                    sb.append(bitmask >> (num-1) & 1);
                    sb.append("\n");
                    continue;
                case "toggle":
                    bitmask = bitmask ^ (1 <<(num-1) );
                    continue;
                case "all":
                    bitmask = ~0;
                    continue;
                case "empty":
                    bitmask = 0;
                    continue;
            }
        }

        System.out.println(sb);

    }

}
