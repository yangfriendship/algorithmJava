package youzheng.algorithm.beakjoon.beakjoon1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class beakjoon_14891 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LinkedList<Integer>[] queList = new LinkedList[4];

        int T = 0;
        while (T < 4) {

            queList[T] = new LinkedList<>();
            String[] str = br.readLine().split("");
            for (int i = 0; i < str.length; i++) {
                queList[T].add(Integer.valueOf(str[i]));
            }
            T++;
        }// 바퀴 4개를 입력 받아 정리함

        int k = Integer.parseInt(br.readLine());
        for (int i = 0; i < k; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine());
            int target = Integer.parseInt(st.nextToken()) - 1;
            int direction = Integer.parseInt(st.nextToken()); // 1오른쪽, -1왼쪽
            turn(queList, target, direction);

            checkTurn = new boolean[4];     //각 테스트케이스마다 초기화해야한다.
        }

        int sum = queList[0].get(0) + queList[1].get(0) * 2 + queList[2].get(0) * 4
                + queList[3].get(0) * 8;
        System.out.println(sum);


    }

    public static boolean isRng(int moveIndex) {
        if (moveIndex < 0 || moveIndex > 3) { //range over
            return false;
        }
        return true;
    }

    static boolean[] checkTurn = new boolean[4];

    public static void turn(LinkedList<Integer>[] queList, int target, int direction) {

        LinkedList<Integer> targetGear = queList[target];
        checkTurn[target] = true;

        if (isRng(target + 1) && !checkTurn[target + 1]) {//오른쪽바퀴
            LinkedList<Integer> rightGear = queList[target + 1];
            if (!getThree(targetGear).equals(getNine(rightGear))) {
                checkTurn[target + 1] = true;
                turn(queList, target + 1, neighbor(direction));
            }
        }
        if (isRng(target - 1) && !checkTurn[target - 1]) { //왼쪽바퀴
            LinkedList<Integer> leftGear = queList[target - 1];
            if (!getNine(targetGear).equals(getThree(leftGear))) {
                checkTurn[target - 1] = true;
                turn(queList, target - 1, neighbor(direction));
            }
        }
        turnGear(targetGear, direction); //재귀함수가 끝나고 돌아오면 비로서 자신을 돌림
        // 바퀴 방향을 미리 바꾸면 한 칸씩 밀리므로 다음 바퀴가 안 돌수도 있다.
        // 꼭 재귀함수가 돌아올 때, 돌아가도록 설정!

    }

    public static int neighbor(int direction) {  // 자신과 이웃한 바퀴는 반대방향으로 돌아야한다.
        return direction * -1;                  // 방향을 바꿔주는 메서드
    }

    public static void turnGear(LinkedList<Integer> list, int direction) {
        if (direction == 1) {             //방향을 체크해서 회전시킴. 1=오른쪽, -1=왼쪽
            right(list);
        } else if (direction == -1) {
            left(list);
        }
    }

    public static Integer getThree(LinkedList<Integer> list) {   //세시방향(2번index)의 값을 가져옴
        return list.get(2);
    }

    public static Integer getNine(LinkedList<Integer> list) {    //아홉시방향(6번index)의 값을 가져옴
        return list.get(6);
    }

    public static void right(LinkedList<Integer> list) {
        list.add(0, list.getLast());
        list.removeLast();
    }

    public static void left(LinkedList<Integer> list) {
        list.addLast(list.pop()); // 제일 앞을 제일 뒤에 넣는다.
    }

}
