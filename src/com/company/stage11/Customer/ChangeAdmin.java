package com.company.stage11.Customer;

import java.util.Scanner;

public class ChangeAdmin {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Admin admin=new Admin();
		admin.name="admin1";
		admin.password="11111";
		System.out.println("请输入用户名：");
		String name1=sc.next();
		System.out.println("请输入用户密码：");
		String pwd=sc.next();
		if(name1.equals(admin.name)&&pwd.equals(admin.password)){
			System.out.println("请输入更改密码：");
			admin.password=sc.next();
			System.out.println("更改成功；您更改的密码为"+admin.password);
		}else{
			System.out.println("您输入的用户名或密码有误;您无权更改密码");
		}
	}

}
