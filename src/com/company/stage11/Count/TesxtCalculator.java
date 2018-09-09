package com.company.stage11.Count;

import java.util.Scanner;

public class TesxtCalculator {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Calculator a=new Calculator();
		System.out.println("请输入第一个数字");
		a.num=sc.nextInt();
		System.out.println("请输入第二个数字");
		a.num1=sc.nextInt();
		System.out.println("请输入运算符号");
		a.a=sc.next();
		a.show();
	}

}
