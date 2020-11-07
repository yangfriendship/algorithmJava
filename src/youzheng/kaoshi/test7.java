package youzheng.kaoshi;

public class test7 {

    public static void main(String[] args) {

    int n = 4;
    boolean horizontal = true;

        int[][] solution = solution(n, horizontal);

        for (int i = 0; i < solution.length ; i++) {

            for (int j = 0; j < solution[0].length; j++) {
                System.out.printf("%d ",solution[i][j]);
            }
            System.out.println();
        }

    }

    public static int[][] solution(int n, boolean horizontal) {
        int[][] answer = new int[n][n]; //true right , false left
        rng = n;
        int moveCnt = (int)Math.pow(n,2)-1;
        int[] curr = new int[]{0,0};
        int x = 0;
        int y = 0;
        int time =0;
        for (int i = 0; i < moveCnt ; i++) {

            answer[y][x] = time;
            if(!isRng(x,y,horizontal)){ // 턴해야된다
                if(horizontal){ //오른쪽으로 가던 중임
                    horizontal = false;
                    if(x+1 >= rng){
                        y+=1;
                    }else{
                        x += 1;
                    }
                    time +=1;

                }else {
                    horizontal = true;
                    if(y+1 >= rng){
                        x+=1;
                    }else{
                        y += 1;
                    }
                    time +=1;

                }

            }else { //아직 더 갈수 있음.
                if(horizontal){
                    x+=1;
                    y-=1;
                    time+=2;
                }else{
                    y+=1;
                    x-=1;
                    time+=2;
                }


            }

        }

        answer[n-1][n-1] = time;

        return answer;
    }
    static int rng;
    public static boolean isRng(int x, int y,boolean horizontal){

        if(horizontal){
            if(x+1 >= rng || y-1 < 0){
                return false;
            }
        }else {
            if(x-1 < 0 || y+1 >= rng){
                return false;
            }
        }
        return true;
    }


}
