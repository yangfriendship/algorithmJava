package youzheng.algorithm.beakjoon.beakjoon2;

public class woote_4 {

    static class User {

        private int left;
        private int right;
        private int maxScore;

        static boolean isOrder(int page) {
            if (page % 2 == 0) {
                return true;
            }
            return false;
        }


        public User(int page) {
            if (isOrder(page)) {
                this.left = page - 1;
                this.right = page;
                this.maxScore = -1;
            } else {
                this.left = page;
                this.right = page + 1;
                this.maxScore = -1;
            }
        }

        public int getLeft() {
            return left;
        }

        public void setLeft(int left) {
            this.left = left;
        }

        public int getRight() {
            return right;
        }

        public void setRight(int right) {
            this.right = right;
        }

        public int getMaxScore() {
            if (this.maxScore == -1) {
                int leftScoure = getLeftMax();
                System.out.printf("leftScore : %d",leftScoure);
                int rightScoure = getRightMax();
                System.out.printf("rightScore : %d",rightScoure);

                this.maxScore = leftScoure > rightScoure ? leftScoure :rightScoure;
               return this.maxScore;
            }
            return maxScore;
        }
        public int getLeftMax(){
            int addScoure = add(this.left);
            int multiScoure = multifly(this.left);

            return addScoure > multiScoure ? addScoure : multiScoure;
        }

        public int getRightMax(){
            int addScoure = add(this.right);
            int multiScoure = multifly(this.right);

            return addScoure > multiScoure ? addScoure : multiScoure;
        }

        public void setMaxScore(int maxScore) {
            this.maxScore = maxScore;
        }

        static int add(int page) {
            int result = 0;
            while (page > 0) {
                result += page % 10;
                page /= 10;
            }
            return result;
        }

        static int multifly(int page) {
            int result = 1;
            while (page > 0) {

                result *= page % 10;
                page /= 10;
            }
            return result;
        }


    }

    public static void main(String[] args) {
        int page = 100;
        int page2 = 200;
        User userA = new User(103);
        User userB = new User(200);

        System.out.println(userA.getLeft());
        System.out.println(userA.getRight());
        System.out.println(userA.getLeftMax());
        System.out.println(userA.getRightMax());
        System.out.println(userB.getLeft());
        System.out.println(userB.getRight());
        System.out.println(userB.getLeftMax());
        System.out.println(userB.getRightMax());

        System.out.println("userA score : "+userA.getMaxScore());
        System.out.println("userB score : "+userB.getMaxScore());

        int result =match(userA,userB);
        System.out.println(result);
    }

    private static int match(User userA, User userB) {

        int scoreA = userA.getMaxScore();
        int scoreB = userB.getMaxScore();
        return scoreA > scoreB? 1 : scoreB > scoreA ? 2 : -1;

    }

}
