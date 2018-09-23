package com.company.stage15;

import java.util.Scanner;

public class Goods {
    String[] goods = new String[]{"电风扇", "洗衣机", "电视机", "冰箱", "空调机"};
    double[] price = new double[]{124.23, 4500, 8800.90, 5000.88, 4456, 12000.46};

    public boolean login(String name, String paw) {
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        while (flag) {
            System.out.print("请输入用户名：");
            name = sc.next();
            System.out.print("请输入密码：");
            paw = sc.next();
            if (name.equals("TOM") && paw.equals("123")) {
                System.out.println("登入成功！");
                show();
                flag = false;
            } else {
                System.out.println("登陆失败,请重新输入");

            }
        }
        return flag;
    }

    public void show() {
        System.out.println("******************************欢迎进入商品批发城**************************");
        System.out.println("\t编号\t\t商品\t\t价格");
        for (int i = 0; i < goods.length; i++) {
            System.out.print("\t" + (i + 1));
            System.out.print("\t\t" + goods[i]);
            System.out.print("\t\t" + price[i] + "\n");
        }
        System.out.println("************************************");
    }

    public StringBuffer change(double d) {
        StringBuffer str = new StringBuffer(String.valueOf(d));
        for (int i = str.indexOf(".") - 3; i > 0; i = i - 3) {
            str.insert(i, ',');
        }
        return str;
    }
}
