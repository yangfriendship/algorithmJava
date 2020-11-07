package youzheng.algorithm.beakjoon.beakjoon2;

public class woote_5 {

    static int cnt;

    public static void main(String[] args) {
        cnt = 0;
        int num = 33 ;

        for (int i = 1; i <= num; i++) {
            if(isTrue(i)){
                cnt ++;
            }
        }
        System.out.println(cnt);
        cnt =0;
    }

    private static boolean isTrue(int num) {

        while(num > 0 ){
            if(num%3==0)    return true;
            num/=10;
        }
        return false;
    }

}
