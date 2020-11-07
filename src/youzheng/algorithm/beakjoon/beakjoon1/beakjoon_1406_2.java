package youzheng.algorithm.beakjoon.beakjoon1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class beakjoon_1406_2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String sb = br.readLine();
		int n = Integer.parseInt(br.readLine());
		int max =0;
		
		String[] arr = sb.split("");
		
		List<String> list = new LinkedList<String>();
		for (int i = 0; i < arr.length; i++) {
			list.add(arr[i]);
		}
		
		int curr = list.size();
		
		while(n -- > 0) {
			String comm = br.readLine();
			max = list.size();
			switch (comm) {
			case "L":
				if(curr >0) {
					curr--;
				}
				break;

			case "D":
				if(curr < max) {
					curr++;
				}
				break;
			
			case "B":
				if(curr>0) {
					list.remove(curr-1);
					
					curr--;
				}
				break;
			default :
				String add = comm.substring(2,comm.length());
				list.add(curr, add);
				curr++;
				break;
			}
			for (int i = 0; i < curr; i++) {
			}
		}
		System.out.println(list.toString().replaceAll("[^\\w]", ""));
	}//main
}
