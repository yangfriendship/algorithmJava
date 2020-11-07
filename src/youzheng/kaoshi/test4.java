package youzheng.kaoshi;

public class test4 {

    public static void main(String[] args) {

    int n = 3;
    int[][] board = {{3, 5, 6}, {9, 2, 7}, {4, 1, 8}};
        int result = solution(n, board);
        System.out.println(result);

//        int n2 = 4;
//        int[][] board2 = {{11, 9, 8, 12}, {2, 15, 4, 14}, {1, 10, 16, 3}, {13, 7, 5, 6}};
//        int result2 = solution(n2, board2);
//        System.out.println(result2);

    }
    static int length ;
    public static int solution(int n, int[][] board) {
        int answer = 0;
        length = n;
        int[][] gps = getGps(board);
        gps[0][1] = 0;
        gps[0][0] = 0;

        int total = 0;

        for (int i = 0; i < gps.length ; i++) {

            System.out.printf("num :%d ,x: %d ,y: %d",i,gps[i][0],gps[i][1]);
            System.out.println();
        }

        for (int i = 0; i < gps.length-1; i++) {
            int xDist = 0;
            int yDist = 0;
            if(gps[i][0] != gps[i+1][0]){
                 xDist = getDist(gps[i][0],gps[i+1][0]);
            }
            if(gps[i][1] != gps[i+1][1]){
                yDist = getDist(gps[i][1],gps[i+1][1]);
            }
            System.out.printf("%d -> %d ,%d , %d \n",i,i+1,xDist,yDist);
            total+= (xDist+yDist);
        }
        System.out.println("pow: "+(int)Math.pow(n,2));
        
        return total+(int)Math.pow(n,2);
    }
                            //0 2       3
    private static int getDist(int n, int m) {
        int p1=Math.abs(n-m); // ok
        int p2= 1+ n + (length - 1 -m);
        int p3= (m) + (length-n); //왼쪽 텔포

        return  Math.min(p1,Math.min(p2,p3));
    }

    public static int[][] getGps(int[][] board){
        int[][] gps = new int[(int) Math.pow(board.length,2)+1][2];
        for (int i = 0; i <board.length ; i++) {

            for (int j = 0; j < board[0].length; j++) {
                int num = board[i][j];
                gps[num][0] = j;
                gps[num][1] = i;
            }
        }
        return gps;
    }



}
