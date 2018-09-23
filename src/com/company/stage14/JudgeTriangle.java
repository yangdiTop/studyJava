package com.company.stage14;

import java.util.Scanner;

public class JudgeTriangle {
    public boolean isTriangle(int a, int b, int c) {
        boolean flag = true;
        if (a + b > c || a + c > b || b + c > a) {

            return flag;
        } else {
            flag = false;
            System.out.println("这不能构成三角形");
            return flag;
        }
    }

    public void shape(int a, int b, int c) {
        boolean flag = true;
        String shape = "";
        String letter = "";
        Scanner sc = new Scanner(System.in);
        while (flag) {
            System.out.print("请输入第一条边：");
            a = sc.nextInt();
            System.out.print("请输入第二条边：");
            b = sc.nextInt();
            System.out.print("请输入第三条边：");
            c = sc.nextInt();
            if (a + b <c || a + c < b || b + c < a) {
                System.out.println("这不是三角形");
                System.out.print("要继续吗？(y/n)");
                letter = sc.next();
            }else{
                if (c * c == a * a + b * b || b * b == a * a + c * c || a * a == b * b + c * c) {
                    shape = "这是一个直角三角形";
                } else if (c * c > a * a + b * b || a * a > b * b + c * c || b * b > a * a + c * c) {
                    shape = "这是一个钝角三角形";
                } else if (a == b && b == c) {
                    shape = "这是一个等边三角形";
                } else {
                    shape = "这是一个锐角三角形";
                }
                System.out.println(shape);
                System.out.print("要继续吗？(y/n)");
                letter = sc.next();
                if (letter.equals("n")) {
                    System.out.print("谢谢使用");
                    break;
                }
            }
        }
    }
}

