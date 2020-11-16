package youzheng.algorithm.programers.level2;

public class programers42890 {

    public static void main(String[] args) {

        String[][] input = {{"100","ryan","music","2"}
,{"200","apeach","math","2"}
,{"300","tube","computer","3"}
,{"400","con","computer","4"}
,{"500","muzi","music","3"}
,{"600","apeach","music","2"}};

        solution(input);

    }

    public static int solution(String[][] relation) {
        int answer = 0;

        boolean[] isPk = new boolean[relation[0].length];
        boolean[] visit = new boolean[isPk.length];
        for (int i = 0; i < relation[0].length; i++) {


        }


        return answer;
    }

    private static void bfs(String[][] relation, boolean[] isPk,boolean[] visit
            , int r,int k, int start, String str) {




    }

    public static String getCombineStr(String[] arr,int start, int end){
        StringBuffer sb = new StringBuffer();
        for (int i = start; i <=end ; i++) {
            sb.append(arr[i]);
        }
        return sb.toString();
    }


}
