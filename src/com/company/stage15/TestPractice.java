package com.company.stage15;

import java.util.Scanner;

public class TestPractice {
    public static void main(String[] args) {
        Practice1 sc = new Practice1();
        boolean a = true;
        Scanner cs = new Scanner(System.in);
        System.out.println("欢迎进入注册系统=========");
        do {
            System.out.println("请输入用户名：");
            String name = cs.next();
            System.out.println("请输入密码：");
            String pwd1 = cs.next();
            System.out.println("请再次输入密码：");
            String pwd2 = cs.next();
            sc.verify(name, pwd1, pwd2);
            a = false;
        } while (a);
    }
}
