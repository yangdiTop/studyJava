package com.company.stage14;

import java.util.Scanner;

public class TestPractice1 {
    public static void main(String[] args) {
        String name = "";
        boolean a = true;
        Scanner sc = new Scanner(System.in);
        Practice1 cs = new Practice1();
        while (a) {
            System.out.println("请输入客户姓名");
            name = sc.next();
            cs.addName(name);
            System.out.println("继续输入吗？(y/n)");
            String print = sc.next();
            if (print.equals("n")) {
                a = false;
                cs.showNames();
            }
        }

    }

}