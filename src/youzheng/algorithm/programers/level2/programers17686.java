package youzheng.algorithm.programers.level2;

import java.util.Arrays;
import java.util.Comparator;

public class programers17686 {

    public static void main(String[] args) {

        String[] input = {"img12.png", "img10.png", "img02.png", "img1.png", "IMG01.GIF", "img2.JPG"};
//        String[] input = {"F-5 Freedom Fighter", "B-50 Superfortress", "A-10 Thunderbolt II", "F-14 Tomcat"};

        String[] result = solution(input);

        for (int i = 0; i < result.length; i++) {
            System.out.printf("%s ", result[i]);
        }

    }

    public static String[] solution(String[] files) {
        String input = "F-15";
        System.out.println(input);
        String[] split = splitStr(input);
        System.out.println(split[0]);
        System.out.println(split[1]);
        System.out.println(split[2]);


//        Arrays.sort(files, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                String[] split1 = splitStr(o1.toLowerCase());
//                String[] split2 = splitStr(o2.toLowerCase());
//
//                if (split2[0].compareTo(split1[0]) == 0) { // 헤더 부분이 같음
//                    int num1 = Integer.parseInt(split1[1]);
//                    int num2 = Integer.parseInt(split2[1]);
//
//                    if (num1 < num2) {
//                        return -1;
//                    } else if (num2 < num1) {
//                        return 1;
//                    } else {
//                        return 0;
//                    }
//
//                }
//                return split1[0].compareTo(split2[0]);
//            }
//        });


        return files;
    }

    public static String[] splitStr(String str) {

        String[] arr = new String[3];
        int headLast = 0;
        boolean findHead = false;


        for (int i = 0; i < str.length(); i++) {
           char target = str.charAt(i);

            if((int)target >= 47 && (int)target <=58){
                if(!findHead){
                    arr[0] = str.substring(0,i);
                    headLast = i;
                    findHead= true;
                }
            }
            if(findHead && arr[1] ==null){
                if((int)target <47 || (int)target >58){
                    arr[1] = str.substring(arr[0].length(),i);
                }
            }
        }

        if(arr[1] == null){
            arr[1] = str.substring(arr[0].length());
            return arr;
        }
        arr[2] = str.substring(arr[0].length()+arr[1].length());
        arr[1] = arr[1].trim();

        return arr;
    }



}
