package com.company.stage11.Computer;

import java.util.Scanner;

public class TextComputer {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Computer a=new Computer();
		System.out.println("CPU");
		a.CPU=sc.next();
		System.out.println("主板");
		a.mainboard=sc.next();
		System.out.println("显示器");
		a.display=sc.next();
		System.out.println("硬盘");
		a.harddisk=sc.next();
		System.out.println("内存");
		a.memory=sc.next();
		a.showInfo();

	}

}
