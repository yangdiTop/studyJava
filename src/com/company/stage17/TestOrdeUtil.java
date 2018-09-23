package com.company.stage17;

import java.util.Scanner;

public class TestOrdeUtil {
    public static  void main(String[]args){
        OrdeUtil cs=new OrdeUtil();
        Scanner sc=new Scanner(System.in);
        boolean flag=false;
        int num=0;
        do{
            System.out.println("欢迎使用“吃货联盟订单系统”");
            System.out.println("***********************************************");
            System.out.println("1.我要订单");
            System.out.println("2.查看餐带");
            System.out.println("3.签收订单");
            System.out.println("4.删除订单");
            System.out.println("5.我要点赞");
            System.out.println("6.退出系统");
            System.out.println("*************************************************\n");
            System.out.println("请选择");
            int choose=sc.nextInt();
            switch(choose){
                case 1:
                    flag=cs.add();
                    break;
                case 2:
                    cs.find();
                case 3:
                    cs.qsdd();
                case 4:
                    cs.deletedd();
                case 5:
                    cs.praise();
                case 6:
                    break;
            }
            if(flag){
                System.out.println("输出0返回！");
                num=sc.nextInt();
            }
        }while(num==0);
    }
}
