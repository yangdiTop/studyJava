package com.company.stage14;

import java.util.Scanner;

/**
 * Demo class
 *
 * @author Loan贷款
 * @date 2018/9/16
 */

public class Loan {
    double loan(double loan, int yearchoice) {
        double refund = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入贷款金额");
        loan = sc.nextDouble();
        System.out.print("请输入贷款年限:1.3年(36个月) 2.5年(60个月) 3.20年(250个月)");
        yearchoice = sc.nextInt();
        switch (yearchoice) {
            case 1:
                refund = (loan + loan * 0.0603) / 36;
                break;
            case 2:
                refund = (loan + loan * 0.0612) / 60;
                break;
            case 3:
                refund = (loan + loan * 0.0639) /250;
                break;
                default:
                    System.out.println("无此选项");
                    break;


        }
        System.out.println("***月供为："+refund);
        return refund;
    }
}
