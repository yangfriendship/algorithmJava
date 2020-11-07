package youzheng.algorithm.beakjoon.beakjoon1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class beakjoon_2504 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		

		String str = br.readLine();
		String temp = new String(str);

		str = str.replace("()", "2");
		str = str.replace("[]", "3");
		String[] arr = str.split("");
		
			Stack<String> stk = new Stack<String>();
			try {
				for (int i = 0; i < arr.length; i++) {
					String value = arr[i];
					if (stk.isEmpty()) {
						stk.add(arr[i]);
					} else {
						if (checkInteger(stk.peek(), value)) {
							value = String.valueOf((Integer.parseInt(value) + Integer.parseInt(stk.pop())));
							stk.add(value);
						} else if (value.equals("(") || value.equals("[")) {
							stk.add(value);
						} else if (value.equals(")") || value.equals("]")) {
							if(stk.size()>=2 && value.equals(")")) {
								int sum = 0;
								int index = stk.size()-1;
								if(value.equals(")")) {
									while(!stk.get(index).equals("(")) {
										try {
											sum += Integer.parseInt(stk.pop());
											index --;
										}catch (Exception e) {
											System.out.println(0);
											return;
										}
									}
									if(stk.get(index).equals("(")) {
										stk.pop();
									}
									stk.add(String.valueOf(sum*2));
								}else if(value.equals("]")) {
									while(!stk.get(index).equals("[")) {
										sum += Integer.parseInt(stk.pop());
										index --;
									}
									if(stk.get(index).equals("[")) {
										stk.pop();
									}
									stk.add(String.valueOf(sum*3));
								}
					
								
							}else if(stk.size()>=2 && value.equals("]")) {
								try {
									value = String.valueOf(Integer.parseInt(stk.pop())*3);
									stk.pop();
									stk.add(String.valueOf(value));
								} catch (Exception e) {
									// TODO: handle exception
									System.out.println(0);
									return;
								}
							}
							
						}else {
							stk.add(value);
						}

					}
				
				}
				
				int sum = 0;
				while(!stk.isEmpty()) {
					sum += Integer.parseInt(stk.pop());
				}
				System.out.println(sum);

			} catch (Exception e) {
				System.out.println(0);
				return;
			}
		
	}// main

	public static void printStk(Stack<String> stk) {

		for (int i = 0; i < stk.size(); i++) {
			System.out.print(stk.get(i));
		}
		System.out.println();
	}

	public static boolean checkInteger(String peek, String value) {

		try {
			Integer.parseInt(peek);
			Integer.parseInt(value);
			return true;

		} catch (Exception e) {
			return false;
		}
	}
}
