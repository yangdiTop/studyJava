package com.company.stage9;

import java.util.Scanner;

public class practice4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double price=0;
		int count=0;
		for(int i=1;i<=3;i++){
			System.out.println("请输入第"+i+"人所购的三件商品的价格");
			for(int j=1;j<=3;j++){
				price=sc.nextDouble();
				if(price<300){
					continue;
				}
				count++;
			}
			System.out.println("第"+i+"人共有"+count+"件享受8折优惠");
			count=0;
		}
	}

}
