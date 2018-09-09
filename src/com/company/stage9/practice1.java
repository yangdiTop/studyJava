package com.company.stage9;

import java.util.Scanner;

public class practice1 {

	public static void main(String[] args) {
		int hang=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入三角形行数");
		hang=sc.nextInt();
		for(int i=1;i<=hang;i++){
			for(int j=1;j<=2*i-1;j++){
				System.out.print("*");
			}
			System.out.print("\n");
		}
		int row=0;
		System.out.println("请输入三角形行数");
		row=sc.nextInt();
		for(int i=1;i<=row;i++){
			for(int j=row;j>i-1;j--){
				System.out.print("*");
			}
			System.out.print("\n");


		}
	}
}
