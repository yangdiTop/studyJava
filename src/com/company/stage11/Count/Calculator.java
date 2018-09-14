package com.company.stage11.Count;

public class Calculator {
    int num;
    int num1;
    String letter;

    public void show() {
        if (letter.equals("*")) {
            System.out.println(num + "*" + num1 + "=" + num * num1);
        } else if (letter.equals("/")) {
            System.out.println(num + "/" + num1 + "=" + num / num1);
        } else if (letter.equals("-")) {
            System.out.println(num + "-" + num1 + "=" + (num - num1));
        } else if (letter.equals("+")) {
            System.out.println(num + "+" + num1 + "=" + (num + num1));
        } else {
            System.out.println("您输入额运算符号有误");

        }
    }

}
