package com.company.stage15;

import java.util.Scanner;

public class TestGoods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Goods cs = new Goods();
        double money = 0;
        cs.login("", "");
        System.out.print("请输入您批发的商品编号：");
        int num = sc.nextInt();
        System.out.print("请输入批发数量：");
        int count = sc.nextInt();
        money = cs.price[num - 1] * count;
        System.out.print("您需要支付" + cs.change(money));
    }
}
