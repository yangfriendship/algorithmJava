package youzheng.algorithm.programers.level2;

public class programers17687 {

    public static void main(String[] args) {

//        2	4	2	1
        int n=16;
        int t=16;
        int m=2;
        int p=1;

        String result = solution(n, t, m, p);
        System.out.println(result);
        System.out.println("02468ACE11111111");
        System.out.println(result.equals("02468ACE11111111"));
    }

    public static String solution(int n, int t, int m, int p) {
        String answer = "";
        StringBuffer sb = new StringBuffer();
        int length = (m * t)+1;
        System.out.println("일단 먼저 구할 개수 : "+length);

        int cnt = 1;
        sb.append(0);
        while(sb.length() <= length){
            StringBuffer sbTemp = new StringBuffer();
            int num = cnt;
            cnt ++;
            while(num>0){

                int temp = num % n;

                if(temp >=10 && temp <=16){
                    sbTemp.append(String.valueOf((char)('A'+(temp-10))));
                    System.out.print(String.valueOf((char)('A'+(temp-10))));
                }else {
                    sbTemp.append(String.valueOf((char)('0'+temp)));
                    System.out.print(String.valueOf((char)('0'+temp)));
                }
                num /= n;
            }
            System.out.println();
            sb.append(sbTemp.reverse());
            sbTemp = null;
        }

        StringBuffer my = new StringBuffer();
        System.out.println(sb.length());
        int index = p-1;
        for (int i = 0; i < t; i++) {
            System.out.println("index : "+index);
            my.append(sb.charAt(index));
            index+=m;

        }
        return my.toString();
    }

}
