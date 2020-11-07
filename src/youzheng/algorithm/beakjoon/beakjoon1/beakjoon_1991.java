package youzheng.algorithm.beakjoon.beakjoon1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class beakjoon_1991 {

    static class Node {
        int me;
        int left;
        int right;



        public Node(int me, int left, int right) {
            this.me = me;
            this.left = left;
            this.right = right;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        List<Node> tree = new LinkedList<>();

        StringTokenizer st = null;
        for (int i = 0; i < n; i++) {
            st= new StringTokenizer(br.readLine());

            char[] one = st.nextToken().toCharArray();
            char[] two = st.nextToken().toCharArray();
            char[] three = st.nextToken().toCharArray();

            if(two[0] == '.'){
                two[0] = 'a';
            }
            if(three[0] == '.'){
                three[0] = 'a';
            }

            int yi = one[0]-65;
            int er = two[0]-65;
            int san = three[0]-65;
            tree.add(new Node(yi,er,san));

        }



        Collections.sort(tree, new Comparator<Node>() {
            @Override
            public int compare(Node o1, Node o2) {
                return o1.me - o2.me;
            }
        });
        preOrder(tree,0);
        sb.append("\n");

        innerOrder(tree,0);
        sb.append("\n");
        postOrder(tree,0);
        sb.append("\n");
        System.out.println(sb);

    }//main
    static StringBuffer sb = new StringBuffer();

    static char[] al = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};

    public static void preOrder(List<Node> tree, int r) {
        int me = tree.get(r).me;
        int left = tree.get(r).left;
        int right = tree.get(r).right;
        sb.append(al[me]);

        if(left != 32){
            preOrder(tree,left);
        }
        if (right != 32){
            preOrder(tree,right);
        }
    }

    public static void innerOrder(List<Node> tree, int r) {
        int me = tree.get(r).me;
        int left = tree.get(r).left;
        int right = tree.get(r).right;

        if(left != 32){
            innerOrder(tree,left);
        }
        sb.append(al[me]);

        if (right != 32){
            innerOrder(tree,right);
        }
    }

    public static void postOrder(List<Node> tree, int r) {
        int me = tree.get(r).me;
        int left = tree.get(r).left;
        int right = tree.get(r).right;

        if(left != 32){
            postOrder(tree,left);
        }
        if (right != 32){
            postOrder(tree,right);
        }
        sb.append(al[me]);

    }

}
