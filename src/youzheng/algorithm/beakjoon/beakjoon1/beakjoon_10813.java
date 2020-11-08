    package youzheng.algorithm.beakjoon.beakjoon1;

    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;
    import java.util.StringTokenizer;

    public class beakjoon_10813 {

        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            StringTokenizer st =new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            int[] arr = new int[n+1];

            for (int i = 1; i <= n; i++) {
                arr[i] = i;
            }

            for (int i = 0 ; i <m ; i++) {

                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                change(arr,a,b);
            }

            for (int i = 1; i < arr.length ; i++) {
                System.out.printf("%d ",arr[i]);
            }

        }

        private static void change(int[] arr, int a, int b) {

            int temp = 0;
            temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
        }

    }
