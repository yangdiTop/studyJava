package com.company.stage11.Computer;

public class Computer {
    String CPU;
    String mainboard;//主板
    String display;//显示器
    String harddisk;//硬盘
    String memory;//内存

    public void showInfo() {
        System.out.println("主板:" + mainboard + "显示器:" + display + "硬盘:" + harddisk + "内存:" + memory);
    }

}

