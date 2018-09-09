package com.company.stage11.Time;

import java.util.Scanner;

public class TestCurTime {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		CurTime a=new CurTime();
		System.out.println("请输入年");
		a.year=sc.nextInt();
		System.out.println("请输入月");
		a.month=sc.nextInt();
		System.out.println("请输入日");
		a.day=sc.nextInt();
		System.out.println("请输入点");
		a.dot=sc.nextInt();
		System.out.println("请输入分");
		a.minute=sc.nextInt();
		System.out.println("请输入秒");
		a.second=sc.nextInt();
		a.show();

	}

}
