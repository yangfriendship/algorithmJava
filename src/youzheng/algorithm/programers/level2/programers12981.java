package youzheng.algorithm.programers.level2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class programers12981 {

    public static void main(String[] args) {
//        int n = 3;
//       String[] words = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
        int n = 5;
        String[] words = {"hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"};

        int[] result = solution(n, words);
        Arrays.stream(result).forEach(num ->{
            System.out.printf("%d ",num);
        });
    }

    public static int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        int before = words[0].charAt(words[0].length()-1);
        Set<String> set = new HashSet<>();
        set.add(words[0]);
        for (int i = 1; i < words.length; i++) {
            int turn = (i % n)+1;
            String word = words[i];
            if(word.charAt(0) != before){
                return new int[]{turn,(i/n)+1};
            }
            if(set.contains(word)){
                return new int[]{turn,(i/n)+1};
            }else {
                set.add(word);
                before = word.charAt(word.length()-1);

            }

        }



        return new int[]{0,0};
    }

}
