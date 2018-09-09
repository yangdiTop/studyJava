package com.company.stage11.Game;

import java.util.Scanner;

public class TextInformation {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Information a=new Information();
		System.out.println("属性");
		a.name=sc.next();
		System.out.println("姓名");
		a.name1=sc.next();
		System.out.println("生命值");
		a.life=sc.next();
		a.show();
		System.out.println("属性");
		a.name=sc.next();
		System.out.println("武器名");
		a.name1=sc.next();
		System.out.println("攻击力");
		a.attack=sc.nextInt();
		a.show1();
		System.out.println("属性");
		a.name=sc.next();
		System.out.println("姓名");
		a.name1=sc.next();
		System.out.println("生命值");
		System.out.println("类型");
		a.type=sc.next();
		a.show2();

	}

}
