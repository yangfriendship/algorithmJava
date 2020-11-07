package youzheng.kaoshi;

public class test1 {

    public static void main(String[] args) {

        String[] grades = {"A+","D+","F","C0"};
        int[] weights  ={2,5,10,3};
        int threshold =50;
        int solution = solution(grades, weights, threshold);
        System.out.println(solution);

    }

    public static int solution(String[] grades, int[] weights, int threshold) {
        int total = 0;
        for (int i = 0; i < grades.length; i++) {

            String grade = grades[i];
            int add = getAdd(grade);
            System.out.println(add);
            total += (weights[i] * add);
        }
        return total-threshold;
    }

    public static int getAdd(String grade){
        switch (grade){
            case "A+" : return 10;
            case "A0" : return 9;
            case "B+" : return 8;
            case "B0" : return 7;
            case "C+" : return 6;
            case "C0" : return 5;
            case "D+" : return 4;
            case "D0" : return 3;
            default :return 0;
        }
    }
}
