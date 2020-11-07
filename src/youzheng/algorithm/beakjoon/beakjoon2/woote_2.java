package youzheng.algorithm.beakjoon.beakjoon2;

import java.util.Arrays;

public class woote_2 {


    static StringBuffer answer = new StringBuffer();
    public static void main(String[] args) {

        String input = "I#love you!!";
        char[] chars = input.toCharArray();





        for (int i = 0; i < chars.length; i++) {

            char value = chars[i];

            change(value);


        }
        System.out.println(answer);
    }
    //대문자 65
    //소문자 97

    static void change(char c) {

        if(isletter(c)){
            if(isBigLetter(c)){
                upCharToChange(c);
            }else{
                lowCharToChange(c);
            }
            return;
        }
        answer.append(c);
    }

    static boolean isBigLetter(char c){
        int aski = (int) c;
        if((aski >=65 && aski<=90)){
            return  true;
        }
        return false;
    }

    static void upCharToChange(char c){
        char[] upArr = {'Z' , 'Y' ,'X','W','V','U','T','S','R','Q','P',
                'O','N','M','L','K','J','I','H','G','F','E','D','C','B','A'};
        answer.append(upArr[(int)c-65]);

    }

    static void lowCharToChange(char c){
        char[] lowArr = {'z' , 'y' ,'x','w','v','u','t','s','r','q','p',
                'o','n','m','l','k','j','i','h','g','f','e','d','c','b','a'};
        answer.append(lowArr[(int)c-97]);
    }

    static boolean isletter(char c){
        int aski = (int)c;
        if((aski >=65 && aski<=90)|| (aski >=97 && aski<=122)) return true;
        return false;
    }

}
