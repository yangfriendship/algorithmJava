package youzheng.algorithm.programers.level2;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Test {

    public static void main(String[] args) {

        int[][] v = {{1, 4}, {3, 4}, {3, 10}};

        int x =v[0][0];
        int y =v[0][1];

        if (x == v[1][0]){
            x = v[2][0];
        }else {
            if(x==v[2][0]){
                x=v[1][0];
            }

        }
        if (y == v[1][1]){
            y = v[2][1];
        }else {
            if(y==v[2][1]){
                y=v[1][1];
            }
        }
        System.out.printf("%d %d ",x,y);


    }

}
