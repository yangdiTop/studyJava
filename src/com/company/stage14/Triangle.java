package com.company.stage14;

import java.util.Scanner;

/**
 * 三角形
 */
public class Triangle {
    public void printTriangle(int row, String ch) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入行数");
        row = sc.nextInt();
        System.out.print("请输入打印字符");
        ch = sc.next();
        for (int i = 0; i <= row; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
