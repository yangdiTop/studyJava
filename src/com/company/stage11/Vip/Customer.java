package com.company.stage11.Vip;

public class Customer {
    String name;
    int integral = 0;//积分

    boolean isVip() {
        if (!name.equals("金卡会员") && !name.equals("普卡客户")) {
            System.out.println("查无此用户");
            return false;
        }
        return true;
    }

    void addIntegralForVip() {
        if (name.equals("普卡客户") && integral > 5000) {
            System.out.println("得到回馈积分" + 500);
        } else if (name.equals("金卡会员") && integral > 1000) {
            System.out.println("得到回馈积分" + 500);
        } else {
            System.out.println("积分不足");
        }
    }

}

