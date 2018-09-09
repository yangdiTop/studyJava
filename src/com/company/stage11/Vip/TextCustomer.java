package com.company.stage11.Vip;

import java.util.Scanner;

public class TextCustomer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Customer c = new Customer();
        System.out.println("请输入客户信息");
        c.name = sc.next();
        if (c.isVip()) {
            System.out.println("请输入用户积分");
            c.integral = sc.nextInt();
            c.addIntegralForVip();
        }
    }
}
