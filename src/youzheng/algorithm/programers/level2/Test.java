package youzheng.algorithm.programers.level2;

import java.util.*;

public class Test {

    public static void main(String[] args) {

        long noL = 1 << 50;
        long addL = 1L << 50;
        System.out.println(noL);    //print : 262144
        System.out.println(addL);    //print : 1125899906842624

    }

    public static long toBit(int n){
        return 1 << (n -1);
    }

    public static String printBit(long n){

        StringBuffer sb = new StringBuffer();
        while(n > 0){
            sb.append(n%2);
            n/=2;
        }

        return sb.reverse().toString();
    }

}
