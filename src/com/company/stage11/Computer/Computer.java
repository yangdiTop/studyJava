package com.company.stage11.Computer;

class Computer {
    String CPU;
    String mainBoard;//主板
    String display;//显示器
    String hardDisk;//硬盘
    String memory;//内存

    //一般情况下都是public 要是提示的话 可以删除
    void showInfo() {
        System.out.println("主板:" + mainBoard + "显示器:" + display + "硬盘:" + hardDisk + "内存:" + memory);
    }

}

