package com.company.stage14;

import java.util.Scanner;

public class TestXiuGai {
    public static void main(String[] args) {
        XiuGai xg = new XiuGai();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("请输入客户姓名");
            xg.oldName(sc.next());

        }
        xg.showoldName();
        System.out.println("\n请输入修改的客户姓名");
        String oldName = sc.next();
        System.out.println("请输入新客户的姓名");
        String newName = sc.next();
        xg.editName(oldName, newName);
        System.out.println("*****修改结果******");
        System.out.println("找到并修改成功");
        xg.showoldName();


    }
}

