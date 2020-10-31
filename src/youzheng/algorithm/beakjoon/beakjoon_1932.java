package youzheng.algorithm.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class beakjoon_1932 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        List<List<Integer>> list = new ArrayList<>();
        List<List<Integer>> dp = new ArrayList<>();
        StringTokenizer st = null;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            List<Integer> a = new ArrayList<>();
            while (st.hasMoreTokens()) {
                a.add(Integer.parseInt(st.nextToken()));
            }
            list.add(a);
        }


        List<Integer> initValue = new ArrayList<>();
        initValue.add(list.get(0).get(0));
        dp.add(initValue);

        if (n == 1) {
            System.out.println(dp.get(0).get(0));
            return;
        }

        initValue = new ArrayList<>();
        initValue.add(list.get(0).get(0) + list.get(1).get(0));
        initValue.add(list.get(0).get(0) + list.get(1).get(1));
        dp.add(initValue);

        if (n == 2) {
            System.out.println(Math.max(dp.get(1).get(0), dp.get(1).get(1)));
            return;
        }

        for (int i = 2; i < n; i++) {

            List<Integer> target = list.get(i);
            List<Integer> dpList = new ArrayList<>();

            for (int j = 0; j < target.size(); j++) {
                int beforeMax = 0;
                int nowValue = 0;
                if (j == 0) {
                    beforeMax = dp.get(i - 1).get(j);
                    nowValue = beforeMax + target.get(j);
                } else if (j == target.size() - 1) {
                    beforeMax = dp.get(i - 1).get(j - 1);
                    nowValue = beforeMax + target.get(j);
                } else {
                    beforeMax = Math.max(dp.get(i - 1).get(j - 1), dp.get(i - 1).get(j));
                    nowValue = beforeMax + target.get(j);
                }

                dpList.add(nowValue);
            }
            dp.add(dpList);

        }


        int max = Integer.MIN_VALUE;

        for (Integer value : dp.get(list.size() - 1)) {
            if (value > max) {
                max = value;
            }
        }
        System.out.println(max);
    }//main

    public static void printList(List<List<Integer>> list) {
        int n = list.size();
        for (int i = 0; i < n; i++) {
            List<Integer> a = list.get(i);
            for (Integer num : a) {
                System.out.printf("%d ", num);
            }
            System.out.println();
        }
        System.out.println("======================================");
    }

}
