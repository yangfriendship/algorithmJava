package youzheng.algorithm.beakjoon.beakjoon1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class beakjoon_11723_set {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st ;

        int T = Integer.parseInt(br.readLine());

        Set<Integer> set = new HashSet<>();
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
                    set.add(num);
                    continue;
                case "remove":
                    set.remove(num);
                    continue;
                case "check":
                    if (set.contains(num)) sb.append(1+"\n");
                    else sb.append(0+"\n");
                    continue;
                case "toggle":
                    if (set.contains(num)) set.remove(num);
                    else set.add(num);
                    continue;
                case "all":
                    for (int i = 1; i <= 20; i++) {
                        set.add(i);
                    }
                    continue;
                case "empty":
                    set.clear();
            }
        }

        System.out.println(sb);

    }

}
