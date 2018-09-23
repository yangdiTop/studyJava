package com.company.stage15;

public class Practice1 {
    public boolean verify(String name, String pwd1, String pwd2) {
        boolean flag = false;
        if (name.length() < 3 && pwd1.length() < 6 && pwd2.length() < 6) {
            System.out.println("用户名长度不小于3，密码长度不小于6");
        } else {
            if (name.length() >= 3 && pwd1.equals(pwd2)) {
                System.out.println("注册成功");
                flag = true;
            } else {
                System.out.println("两次输入密码不同");
            }
        }
        return flag;
    }

}
