package youzheng.algorithm.beakjoon.beakjoon2;

import java.util.Arrays;

public class woote_1 {

    public static void main(String[] args) {
        int money = 50237;

        int[] coin = new int[]{50000, 10000, 5000, 1000, 500, 100, 50, 10, 1};
        int[] result = new int[coin.length];
        int index = 0;
        while(index < coin.length&&money>0){
            int cnt = 0;
            while (money-coin[index]>=0){

                money -= coin[index];
                cnt ++;
            }
            result[index] = cnt;
            index++;
        }
        System.out.print("[");
        Arrays.stream(result).forEach(count -> {
            System.out.printf("%d, ",count);
        });
        System.out.print("]");


    }

}
