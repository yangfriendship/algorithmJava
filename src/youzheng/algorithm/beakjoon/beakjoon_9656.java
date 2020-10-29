    package youzheng.algorithm.beakjoon;

    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;

    public class beakjoon_9656 {

        public static void main(String[] args) throws IOException {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int n = Integer.parseInt(br.readLine());
            int cnt = 0;
            System.out.println(n%2==0 ? "SK" : "CY");


        }

    }
