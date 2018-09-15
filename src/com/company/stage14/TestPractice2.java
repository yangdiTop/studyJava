package com.company.stage14;

import java.util.Scanner;

public class TestPractice2 {
    public static void main(String[] args) {
        int num=5;
        String name = new String();
        Scanner sc = new Scanner(System.in);
        Practice2 cs = new Practice2();
        for (int i = 0; i < num; i++) {
            System.out.print("请输入客户姓名");
            name = sc.next();
            cs.addName(name);
        }
        cs.showNames();
        System.out.println("\n请输入要修改的姓名");
        name = sc.next();
        System.out.print("请输入新的姓名");
        String newName = sc.next();
        cs.editName(name, newName);
        System.out.println("*****修改结果*****");
        System.out.println("找到并修改成功！");
        cs.showNames();
    }
}
