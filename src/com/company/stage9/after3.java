package com.company.stage9;

import java.util.Scanner;

public class after3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int score=0;
		int count=0;
		int sum=0;
		for(int i=1;i<=3;i++){
			System.out.println("第"+i+"个班学员成绩");
			for(int j=1;j<=4;j++){
				score=sc.nextInt();
				if(score>=85){
					count++;
					sum=sum+score;
				}
			}
			System.out.println("大于85分学员"+count);
			System.out.println("平均分"+sum/count);
		}
	}

}
