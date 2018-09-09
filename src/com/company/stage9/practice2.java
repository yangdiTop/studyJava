package com.company.stage9;

import java.util.Scanner;

public class practice2 {

	public static void main(String[] args) {
		int row=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入三角形行数");
		row=sc.nextInt();
		for(int i=1;i<=row;i++){
			for(int j=1;j<=row-i;j++){
				System.out.print(" ");
			}
			for(int a=1;a<=2*i-1;a++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}