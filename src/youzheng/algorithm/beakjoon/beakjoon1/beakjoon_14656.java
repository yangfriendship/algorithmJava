    package youzheng.algorithm.beakjoon.beakjoon1;

    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;
    import java.util.StringTokenizer;

    public class beakjoon_14656 {

        public static void main(String[] args) throws IOException {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int n = Integer.parseInt(br.readLine());
            int cnt = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());

            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
                if(arr[i] != i+1){
                    cnt ++;
                }

            }
            System.out.println(cnt);

        }

        private static int lis(int[] arr) {
            int result = Integer.MIN_VALUE;

            int[] dp = new int[arr.length];
            dp[0] = 1;


            for (int i = 1; i < arr.length; i++) {
                int max = 0;
                for (int j = 0; j < i; j++) {

                    if(arr[i]> arr[j] && dp[j] > max){
                        max = dp[j];

                    }

                }
                dp[i] = max +1;
                if(dp[i] > result){
                    result = dp[i];
                }
            }


            return  result;

        }

    }
