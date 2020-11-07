package youzheng.algorithm.beakjoon.beakjoon1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class beakjoon_2670 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        double[] arr = new double[n];
        double max = Double.MIN_VALUE;

        for (int i = 0; i <n; i++) {
            arr[i] = Double.parseDouble(br.readLine());
        }

        for (int i = 0; i < n; i++) {
            double sum = 1;

            for (int j = i; j < n ; j++) {
                sum *= arr[j];
                if (sum > max) {
                    max = sum;
                }
            }
        }


        System.out.println(String.format("%.3f",max));
    }

}
