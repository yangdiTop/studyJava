package com.company.stage14;

import java.util.Scanner;

public class Practice4 {
    public void bank() {
        int money = 0;
        int sum = 0;
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        while (flag) {
            System.out.println("1.存款 2.取款 0.退出");
            System.out.print("请选择你需要办理的业务");
            int num = sc.nextInt();
            switch (num) {
                case 1:
                    System.out.print("请输入存款金额");
                    money = sc.nextInt();
                    System.out.println("存款成功");
                    sum += money;
                    System.out.println("*****当前余额为" + sum + "元*****");
                    break;
                case 2:
                    System.out.print("请输入取款金额");
                    int qmoney = sc.nextInt();
                    System.out.println("取款成功");
                    System.out.println("*****当前余额为" + (sum - qmoney) + "元*****");
                    break;
                case 0:
                    flag = false;
                    System.out.println("谢谢使用");
                    break;
                default:
                    System.out.println("输入有误");
            }

        }
    }

}