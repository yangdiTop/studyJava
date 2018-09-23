package com.company.stage15;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        System.out.println("欢迎进入注册系统=======");
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {

            System.out.print("请输入身份证号：");
            String user = sc.next();
            System.out.print("请输入手机号：");
            String phone = sc.next();
            System.out.print("请输入座机号：");
            String zuoJi = sc.next();
            if (user.length() == 16 || user.length() == 18) {
                if (phone.length() == 11) {
                    String[] zifu = zuoJi.split("-");
                    String haoMa = zifu[0];
                    String qiTa = zifu[1];
                    if (haoMa.length() == 4 && qiTa.length() == 7) {
                        System.out.println("注册成功");
                        flag = false;
                    } else {
                        System.out.println("座机区号必须为4位，电话号码必须是7位！");
                    }
                } else {
                    System.out.println("手机号必须是11位");
                }
            } else {
                System.out.println("身份证号必须是16位或者18位！！！");
            }
        }
    }
}
