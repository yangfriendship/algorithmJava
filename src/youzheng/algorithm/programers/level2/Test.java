package youzheng.algorithm.programers.level2;

import java.util.*;

public class Test {

    private static long[][] arr;

    public static void main(String[] args) {

        arr = new long[3][3];

        arr[2][2] = 7;

        boolean a = isWall(2, 2, 1);
        boolean b = isWall(2, 2, 2);
        boolean c = isWall(2, 2, 3);
        boolean d = isWall(2, 2, 4);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
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