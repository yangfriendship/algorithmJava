package youzheng.algorithm.beakjoon.beakjoon1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class beakjoon_2636_2 {

    static int n;
    static int m;
    static int cnt;
    static int[][] visit;
    static int[][] arr;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[n][m];
        visit = new int[n][m];  //boolean은 두 가지 경우만 갖을 수 있지만, int는 0방문x,1방문함,2방문and녹아야할치즈
                                //세가지 경우를 체크하기 위하여 int배열을 사용
        int turn = 0;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                int value = Integer.parseInt(st.nextToken());
                arr[i][j] = value;
                if(value==1){   // 치즈개수 체크
                    cnt ++;
                }

            }
        }           // 입력받음, 동시에 치즈의 개수를 체크함
        br.close();

        int answer = cnt;
        while(cnt > 0){
            answer = cnt;   // 다 녹기 한 시간 전 치즈 개수를 구해야하므로 턴이 넘어가기전에 cnt값을 answer에 저장
            ++turn;         // 함수가 실행되면 turn을 증가시켜줌
            bfs(0,0);   // 배열의 테두리는 치즈가 오지 않으므로, 시작점을 y=0,x=0으로 설정한다.
            melt();         //visit[] 배열은 총 세가지로 0=방문안함, 1=방문함, 2=방문+녹아야할치즈
                            // melt메서드는 녹아야할 함수를 arr배열의 0(공기)으로 값을 재정의함.
        }

        System.out.println(turn);
        System.out.println(answer);
    }

    public static void bfs(int y, int x) {

        if (arr[y][x] == 1) {
            if(isSideCheese(y,x)){
                visit[y][x] = 2;
                return;
            }
        }
        int[] add = new int[]{0, 0, 1, -1};
        for (int i = 0; i < 4; i++) {
            int newY = y+add[i];
            int newX = x+add[3-i];
            if (isRng(newY, newX) && visit[newY][newX]==0) {
                visit[newY][newX] = 1;
                bfs(newY, newX);
            }
        }
    }

    public static boolean isRng(int y , int x){ // 배열의 크기를 넘지 않도록 체크
        if(y < 0 || y>= n || x < 0 || x >= m){
            return false;
        }
        return true;
    }

    public static boolean isSideCheese(int y, int x) {  
        // 상하좌우를 이동하는 for문, 예전에는 이중for문으로 했지만, 이렇게도 가능하더라
        int[] add = new int[]{0, 0, 1, -1};     //검사하는 치즈의 상하좌우 네 방향중에서 하나라도 0(공기라면)
        for (int i = 0; i < 4; i++) {           //녹아야하는 치즈!
            if (arr[y + add[i]][x + add[3 - i]] == 0){
                return true;               
            }
        }
        return false;
    }

    public static void melt() {     //visit를 확인해 2(녹아야할 치즈)의 값을 0(공기)로 바꿔줌
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[0].length; j++) {
                if (visit[i][j] == 2) {
                    arr[i][j] = 0;
                    cnt--;
                }
            }
        }
        visit = new int[n][m];      //다음 bfs를 위해서 melt()를 다 끝내고 visit배열을 0(방문안함)으로 초기화
    }

}
