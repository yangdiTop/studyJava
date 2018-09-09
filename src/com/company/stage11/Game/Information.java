package com.company.stage11.Game;

public class Information {
	String name;
	String name1;
	String life;//生命
	String type;
	int attack;//攻击
	public void show(){
		System.out.println("我是"+name+";我的基本信息如下：");
		System.out.println("名字:"+name1+",生命值："+life);
	}
	public void show1(){
		System.out.println("我是"+name+";我的基本信息如下：");
		System.out.println("武器名字:"+name1+",攻击力："+attack);
	}
	public void show2(){
		System.out.println("我是"+name+";我的基本信息如下：");
		System.out.println("名字:"+name1+",生命值："+life+"类型"+type);

	}
}