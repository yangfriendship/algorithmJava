package youzheng.algorithm.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class beakjoon_1068 {


	static List<List<Integer>> tree = new ArrayList<>();

    public static void main(String[] args) throws IOException {

    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    	int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());


		List<Integer> zeroIndex = new ArrayList<>();
		int target = Integer.parseInt(br.readLine());
		if(target==0){
			System.out.println(0);
			return;
		}
		st.nextToken();
		zeroIndex.add(-1);
		tree.add(zeroIndex);

		for (int i = 1; i < n; i++) {
			List<Integer> child = new ArrayList<>();

			int parent = Integer.parseInt(st.nextToken());
			child.add(parent);
			tree.add(child);
			tree.get(parent).add(i);
		}



		Integer targetParent = tree.get(target).get(0);
		Integer remove = tree.get(targetParent).remove(target);

		order(tree,0);
		System.out.println(sum);
	}// main
	static int sum = 0;


    public static void order(List<List<Integer>> tree, int r){

		List<Integer> leaf = tree.get(r);

		if(leaf.size()==1){
			sum ++;
			return;
		}

		for (int i = 1; i < leaf.size(); i++) {

			if(!leaf.isEmpty()){
				order(tree,leaf.get(i));
			}

		}


	}


}
