package youzheng.algorithm.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//index = 	x/2+1
public class beakjoon_1188_1_my {
	
	// ��� 5�� , �Ҽ��� 3�����
	//	3/5�� n���ϸ� 3���� �Ǵ°�?
	//	�Ҽ��� 2 ��� 6 �� 4
	//3���� 1���� �������ٴ�
	//3���� 1 * n = 2

	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int s = Integer.parseInt(st.nextToken());	//3
		int num = Integer.parseInt(st.nextToken()); //2
		int result = 0;
		//�ҽ��� == �ο� 	�ڸ� �ʿ䰡 ����. �״�� ����
		if (s%num==0) {
			System.out.println(0);
			return;
		}
		if(s>num) { // 13 2 
			s %= num;
		}

		int cut = 1; //��ǻ� ���� 1��
		// n :5/ s:3
		while(true) {
			double value = (s/num+ s%num)*cut; 
			System.out.println(value);
			if(s ==value ) {
				break;
			}
			cut ++;
		}
		
		System.out.println(cut);
		
		
	}
}
