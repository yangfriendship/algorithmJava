package youzheng.algorithm.programers.level2;

import java.util.HashSet;
import java.util.Set;

public class programers12977 {

    public static void main(String[] args) {

//        int[] input = new int[]{1,2,3,4};
        int[] input = new int[]{1,2,7,6,4};

        int result = solution(input);
        System.out.println(result);

    }

    public static int solution(int[] nums) {

        boolean[] visit = new boolean[nums.length];
        int r = 0;
        int k = 0;
        int init = 0;
        int start = 0;
        bfs(nums,visit,r,start,init,0,"");

        return answer;
    }

    static int answer = 0;

    public static void bfs(int[] nums, boolean[] visit, int r, int start, int init, int sum,String str) {

        if (r == 3) {
            if(isPrime(sum)){
                answer ++;
            }

            return;
        }

        for (int i = start; i < nums.length ; i++) {

            if(!visit[i]){
                visit[i] = true;
                bfs(nums, visit, r+1, i+1, init, sum+nums[i],str+" "+nums[i]);
                visit[i] = false;
            }

        }

    }

    private static boolean isPrime(int n){

        for (int i = 2; i*i <= n  ; i++) {
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

}
