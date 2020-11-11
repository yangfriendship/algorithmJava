package youzheng.algorithm.beakjoon.beakjoon1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class beakjoon_5212 {

    static int r;
    static int c;
    static BufferedReader br ;
    public static void main(String[] args) throws IOException {

         br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());

        Character[][] arr = inputData();

        for (int i = 0; i < r; i++) {

            for (int j = 0; j < c; j++) {
                if(arr[i][j] == 'X'){
                    int cnt = 0;
                    if (isRng(j,i+1)) {
                        if (arr[i + 1][j] == '.') {
                            cnt++;
                        }
                    } else {
                        cnt++;
                    }
                    if (isRng(j,i-1)) {
                        if (arr[i - 1][j] == '.') {
                            cnt++;
                        }
                    } else {
                        cnt++;
                    }
                    if (isRng(j+1,i)) {
                        if (arr[i][j + 1] == '.') {
                            cnt++;
                        }
                    } else {
                        cnt++;
                    }
                    if (isRng(j-1,i)) {
                        if (arr[i][j - 1] == '.') {
                            cnt++;
                        }
                    } else {
                        cnt++;
                    }

                    if (cnt >= 3) {
                        arr[i][j] = ',';
                    } else {
                        cnt++;
                    }
                }
            }
        }

        printResult(arr);


    }

    public static Character[][] inputData() throws IOException {
        Character[][] arr = new Character[r][c];
        for (int i = 0; i < r; i++) {
            String str = br.readLine();
            for (int j = 0; j < c; j++) {
                arr[i][j] = str.charAt(j);
            }
        }
        return arr;
    }

    public static void printResult(Character[][] arr) {
        int a = Integer.MAX_VALUE;
        int A = 0;
        int b = Integer.MAX_VALUE;
        int B = 0;

        for (int i = 0; i < r; i++) {

            for (int j = 0; j < c; j++) {

                if (arr[i][j] == 'X') {

                    if (i < b) {
                        b = i;
                    }
                    if (i > B) {
                        B = i;
                    }
                    if (j < a) {
                        a = j;
                    }
                    if (j > A) {
                        A = j;
                    }


                }

            }
        }

        for (int i = b; i <= B; i++) {
            for (int j = a; j <= A; j++) {

                if (arr[i][j] == 'X') {
                    System.out.printf("%c", 'X');
                } else {
                    System.out.printf("%c", '.');
                }
            }
            System.out.println();

        }
    }

    public static void printArr(Character[][] arr) {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {

                System.out.printf("%c", arr[i][j]);
            }
            System.out.println();
        }
    }

    static boolean isRng(int x,int y) {

        if(y >= r || y < 0 || x >=c || x < 0  ){
            return false;
        }

        return true;
    }

}
