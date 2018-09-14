package com.company.stage14;

import java.util.Scanner;

public class TestShuiCaiBi {
   public  static void main(String[] args) {
        ShuiCaiBi scb = new ShuiCaiBi();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入颜色");
        String color = sc.next();
        scb.pen(color);
    }
}

