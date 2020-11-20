package youzheng.algorithm.programers.level2;

import java.util.*;

public class Test {

    private static long[][] arr;

    public static void main(String[] args) {

        String input = "abcde";
        int i = input.charAt(0) - 97;
        System.out.println(i);

    }

    private static boolean isWall(int y, int x, int dir) { //left=1,up=2,right=3,down=4 , dir= 체크할 방향

        long room = arr[y][x];
        long shift = 1L << (dir - 1);
        long result = room & shift;
        if (result == shift) {
            return true;
        }
        return false;
    }
}