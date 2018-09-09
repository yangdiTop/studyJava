package com.company.stage9;

import java.util.Scanner;

	public class after1 {
		public static void main(String[] args) {
			int hang=0;
			Scanner sc=new Scanner(System.in);
			System.out.println("请输入行数");
			hang=sc.nextInt();
			for(int i=1;i<=hang;i++){
				for(int j=1;j<=i;j++){
					System.out.print(j+" ");
				}
				System.out.print("\n");
			}
		}
	}
