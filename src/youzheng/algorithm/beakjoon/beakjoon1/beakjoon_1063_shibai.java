package youzheng.algorithm.beakjoon.beakjoon1;

public class beakjoon_1063_shibai {
	
//	R : �� ĭ ����������
//	L : �� ĭ ��������
//	B : �� ĭ �Ʒ���
//	T : �� ĭ ����
//	RT : ������ �� �밢������
//	LT : ���� �� �밢������
//	RB : ������ �Ʒ� �밢������
//	LB : ���� �Ʒ� �밢������
	static int[] king = new int[2];
	static int[] stone = new int[2];
	

	public static void move(String com) {
		
		switch (com) {
		case "R":
			if(king[1]+1<8 ) {
				king[1] ++;
			}
			break;
		case "L":
			if(king[1]-1>1) {
				king[1] --;
			}
			break;
		case "B":
			if(king[0]<8 && king[0] >1) {
				king[0] --;
			}
			break;
		case "T":
			if(king[0]<8 && king[0] >1) {
				king[0] ++;
			}
			break;	
		case "RT":
			if(king[0]>7 && king[0] >0) {
				king[0] ++;
				king[1] ++;
			}
			break;	
		case "LT":
			if(king[1]>1 && king[0] >0) {
				king[0] ++;
				king[1] --;
			}
			break;	
		case "RB":
			if(king[0]>7 && king[0] >0) {
				king[0] ++;
				king[1] --;
			}
		case "LB":
			if(king[0]>7 && king[0] >0) {
				king[0] ++;
				king[1] --;
			}
			break;	
		}
		
		
	}
	
	public static void init(String kingXy,String stoneXy) {
		
		//A1 A4
		king[0] = kingXy.charAt(1)-'0';
		king[1] = kingXy.charAt(0) - 64;
		stone[0] = stoneXy.charAt(1)-'0';
		stone[1] = stoneXy.charAt(0) - 64;
	}

	public static void main(String[] args) {
		
	}

}
