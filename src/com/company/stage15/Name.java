package com.company.stage15;

import java.util.Scanner;

public class Name {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("输入任意一个姓名：");
        String name=sc.next();
        String xing=name.substring(0,1);
        String ming=name.substring(1);
        System.out.println("姓氏："+xing);
        System.out.println("名字："+ming);

    }
}
