package com.company.stage15;

import java.util.Scanner;

public class Birthday {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入用户的身份证号码：");
        String ID = sc.next();
        String year = ID.substring(6, 10);
        String month = ID.substring(10, 12);
        String day = ID.substring(12, 14);
        System.out.print("该用户的生日是：" + year + "年" + month + "月" + day + "日");
    }
}
