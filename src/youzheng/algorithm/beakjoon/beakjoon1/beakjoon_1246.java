package youzheng.algorithm.beakjoon.beakjoon1;

import java.util.Scanner;

public class beakjoon_1246 {
	
	static int[][]mDays = {
			{31,28,31,30,31,30,31,31,30,31,30,31},
			{31,29,31,30,31,30,31,31,30,31,30,31},
	};

	public static int check(int year) {

		if(year==1) return 0;
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			return 1;
		}
		return 0;
	}
	
	public static int yearCnt(int year) {

		if(year==0) {
			return 0;
		}
		
		int sum =0;
		while(year !=0) {
			
			sum += check(year) == 1 ? 365 : 366;
			year --;
		}
		return sum;
	}
	
	public static int monthCnt(int year,int month) {
		int sum =0;
		int checkedYear = check(year);
		
		if (month == 1) {
			return 0;
		}
		
		for (int i = 1; i < month; i++) {
			
			sum += mDays[checkedYear][i];
		}
		
		
		return sum;
	}

	public static int count(int year,int month,int day) {
		
		return yearCnt(year) + monthCnt(year, month) + day; 
		
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int yearX = sc.nextInt();
		int monthX = sc.nextInt();
		int dayX = sc.nextInt();
		int yearY = sc.nextInt();
		int monthY = sc.nextInt();
		int dayY = sc.nextInt();
		

		int resultY  =count(yearY, monthY, dayY);
		int resultX = count(yearX, monthX, dayX);

		int result = resultY - resultX;
		
		System.out.println(resultY);
		System.out.println(resultX);
		System.out.println(result);
		
		if(yearY-yearX>= 1000 && resultY-resultX>=0) {
			System.out.println("gg");
			return;
		}
		System.out.printf("D-%d",result);
		
		

	}

}
