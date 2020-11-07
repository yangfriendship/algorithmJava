package youzheng.kaoshi;

public class test5 {

    public static void main(String[] args) {

        String penter ="1100";
        String pexit=  "0010";
        String pescape = "1001";
        String data = "1101100100101111001111000000";

        String solution = solution(penter, pexit, pescape, data);
        String answer = "110011011001100110010010111100111001110000000010" ;
        System.out.println(solution);
        System.out.println(solution.equals(answer));

    }
    static  StringBuffer sb;

    public static String solution(String penter, String pexit, String pescape, String data) {
        int length = penter.length();
        String[] codes = {penter,pexit,pescape};
        String[] packets = new String[data.length() / length];
        for (int i = 0; i <packets.length ; i++) {
            packets[i] =  data.substring(i*length,(i+1)*length);
        }
         sb = new StringBuffer();
        sb.append(penter);
        for (int i = 0; i < packets.length; i++) {
            String packet = packets[i];
            if(hasEqualStr(packet,codes)){
                sb.append(pescape);
                sb.append(packet);
            }else{
                sb.append(packet);
            }

        }
        sb.append(pexit);
        return new String(sb);
    }

    private static boolean hasEqualStr(String packet,String[] codes) {

        for (int i = 0; i < codes.length; i++) {
            if(codes[i].equals(packet)) return true;
        }
        return false;
    }

}
