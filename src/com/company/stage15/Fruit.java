package com.company.stage15;

import java.util.Arrays;
import java.util.Scanner;

public class Fruit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] fruit = new String[5];
        for (int i = 0; i < fruit.length; i++) {
            System.out.print("请输入第" + (i + 1) + "种水果");
            fruit[i] = sc.next();
        }
        Arrays.sort(fruit);
        System.out.println("这些水果在字典中出现的顺序是：");
        for (int i = 0; i < fruit.length; i++) {
            System.out.println(fruit[i]);
        }
    }
}
