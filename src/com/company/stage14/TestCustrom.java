package com.company.stage14;

import java.util.Scanner;

public class TestCustrom {
    public static void main(String[] args) {
        Custrom cn = new Custrom();
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("请输入顾客姓名");
            cn.CustromName(sc.next());
            System.out.println("继续输入吗？");
            String choice = sc.next();
            if (choice.equals("y")) {
                flag = true;
            } else {
                flag = false;
                break;
            }

        }
        System.out.println("*********************************************");
        System.out.println("\t\t客户姓名列表");
        System.out.println("*********************************************");
        cn.showName();
    }

}

