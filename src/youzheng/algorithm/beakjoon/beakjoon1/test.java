package youzheng.algorithm.beakjoon.beakjoon1;

import java.util.Arrays;

public class test {

    public static void main(String[] args) {

        int[] arr = new int[]{0,1,2,3,4};

        int[] ints = Arrays.copyOfRange(arr, 0, 1);

        for (int i = 0; i < ints.length; i++) {
            System.out.printf("%d ",ints[i]);
        }

    }

}
