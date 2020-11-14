package youzheng.algorithm.programers.level2;

import java.util.*;

public class Test {

    public static void main(String[] args) {

        int[][] arr = new int[][]{{0, 1, 2, 3, 4},{5,6,7,8,9}};
        int[][] copy = copyArr(arr);
        copy[0][0] = 100;
        printArr(arr);
        System.out.println("====================");
        printArr(copy);


    }

    public static int[][] copyArr(int[][] arr){
        int[][] copy = new int[arr.length][arr[0].length];

        for (int i = 0; i < arr.length; i++) {
            copy[i] = arr[i].clone();
        }


        return copy;
    }

    public static void printArr(int[][] arr) {

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[0].length; j++) {
                System.out.printf("%d ",arr[i][j]);
            }
            System.out.println();
        }

    }

}
