package com.company.stage14;

import java.util.Scanner;

public class Calculator {
    public double ope(int op, int num1, int num2) {
        double result = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("请选择运算：1.加法 2.减法3.乘法4.除法");
        op = sc.nextInt();
        switch (op) {
            case 1:
                System.out.print("请输入第一个数");
                num1 = sc.nextInt();
                System.out.print("请输入第二个数");
                num2 = sc.nextInt();
                result = num1 + num2;
                System.out.println("*****运算结果为：" + result);
                break;
            case 2:
                System.out.print("请输入第一个数");
                num1 = sc.nextInt();
                System.out.print("请输入第二个数");
                result = num1 - num2;
                System.out.println("*****运算结果为：" + result);
                break;
            case 3:
                System.out.print("请输入第一个数");
                num1 = sc.nextInt();
                System.out.print("请输入第二个数");
                result = num1 * num2;
                System.out.println("*****运算结果为：" + result);
                break;
            case 4:
                System.out.print("请输入第一个数");
                num1 = sc.nextInt();
                System.out.print("请输入第二个数");
                result = num1 / num2;
                System.out.println("*****运算结果为：" + result);
                break;
            default:
                System.out.println("请输入正确数字");
        }
        return result;
    }

}
