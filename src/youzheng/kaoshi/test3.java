package youzheng.kaoshi;

public class test3 {

    public static void main(String[] args) {

        int money = 1000;

        String[] expected = {"H", "T", "H", "T", "H", "T", "H"};
        String[] actual = {"T", "T", "H", "H", "T", "T", "H"};

        int result = solution(money, expected, actual);
        System.out.println(result);
    }

    public static int solution(int money, String[] expected, String[] actual) {
        int answer = -1;
        int amount = 100;
        for (int i = 0; i < expected.length; i++) {

            if(money >= amount){ // 배팅액 > 소유금
                money -= amount; // 처음에 패팅을함;
            }else{  //올인..
                amount = money;
                money = 0;
            }
            if(expected[i].equals(actual[i])){ //이김
                money += (amount*2);
                amount = 100;
            }else{ // 돈 짐
                amount *=2;
            }

            if(money<1){
                return 0;
            }

        }

        return money;
    }


}
