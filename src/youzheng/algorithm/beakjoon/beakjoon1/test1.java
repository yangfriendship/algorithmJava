package youzheng.algorithm.beakjoon.beakjoon1;

import java.util.LinkedList;
import java.util.List;

public class test1 {

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        list.addLast(list.pop());

        System.out.println(list);
    }

}
