package com.company.stage12;

import java.util.Scanner;

public class TextMeau {
    public static void main(String[] args) {
        Meau meau = new Meau();
        Scanner sc = new Scanner(System.in);
        meau.showLoginMenu();
        System.out.println("请选择；输入数字：");
        int num = sc.nextInt();
        boolean flag = true;
        while (flag) {
            switch (num) {
                case 1:
                    meau.showMainMenu();
                    System.out.println("请选择；输入数字或0返回上一层：");
                    int num1 = sc.nextInt();
                    switch (num1) {
                        case 1:
                            System.out.println("1.用户");
                            System.out.println("2.会员");
                            flag = false;
                            break;
                        case 2:
                            meau.showCustMenu();
                            System.out.println("请选择；输入数字或0返回上一层：");
                            int num2 = sc.nextInt();
                            switch (num2) {
                                case 1:
                                    System.out.println("执行幸运大放送");
                                    flag = false;
                                    break;
                                case 2:
                                    System.out.println("执行幸运抽奖");
                                    flag = false;
                                    break;
                                case 3:
                                    System.out.println("执行生日问候");
                                    flag = false;
                                    break;
                                default:
                                    System.out.println("输入有误");
                                    break;
                            }
                            break;
                        case 0:
                            break;
                        default:
                            System.out.println("您输入有误！");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("退出本系统！");
                    flag = false;
                    break;
                case 0:
                    break;
                default:
                    System.out.println("您输入的有误！");
                    break;

            }

        }
    }
}

