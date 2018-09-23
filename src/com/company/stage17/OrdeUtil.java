package com.company.stage17;

import java.util.Scanner;

public class OrdeUtil {
    String[] disNames = {"红烧带鱼", "鱼香肉丝", "时令蔬菜"};
    double[] prices = {38, 20, 10};
    int[] praiseNums = new int[3];
    OrderingSet oSet = new OrderingSet();
    Scanner sc = new Scanner(System.in);

    public void initial() {
        oSet.names[0] = "张清";
        oSet.dishMegs[0] = "红烧带鱼";
        oSet.addresses[0] = "天成路207";
        oSet.times[0] = 12;
        oSet.sumPrices[0] = 76;
        oSet.states[0] = 1;
        oSet.names[1] = "张清";
        oSet.dishMegs[1] = "鱼香肉丝";
        oSet.addresses[1] = "天成路207";
        oSet.times[1] = 18;
        oSet.sumPrices[1] = 80;
        oSet.states[1] = 0;
    }

    public boolean add() {
        boolean isAdd = false;
        for (int i = 0; i < oSet.names.length; i++) {
            if (oSet.names[i] == null) {//找到第一个为空的位置
                isAdd = true;
                System.out.println("请输入订餐姓名：");
                String name = sc.next();
                System.out.println("序号" + "\t\t" + "菜名" + "\t\t" + "单价" + "\t\t" + "点赞数");
                for (int k = 0; k < disNames.length; k++) {
                    String priseNum = (praiseNums[k]) > 0 ? praiseNums[k] + "赞" : "0";
                    System.out.println((k + 1) + "\t" + disNames[k] + "\t\t" + prices[k]+ "\t" + priseNum);
                }
                System.out.println("请选择你要点的菜品编号");
                int chooseDish = sc.nextInt();
                System.out.println("请选择你要的份数");
                int number = sc.nextInt();
                String disMeg = disNames[chooseDish - 1] + "" + number + "份";
                double sumprice = prices[chooseDish - 1] * number;
                double delichaege = (sumprice >= 50) ? 0 : 5;//餐费满五十，免费送餐
                System.out.println("请输入送餐时间（10-20点整送餐）");
                int time = sc.nextInt();
                while (time < 10 || time > 20) {
                    System.out.println("您输入的时间有误；请从新输入");
                    time = sc.nextInt();
                }
                System.out.println("请输入送餐地址");
                String address = sc.next();
                System.out.println("订餐成功");
                System.out.println("您订的是" + disMeg);
                System.out.println("送餐时间" + time + "点");
                System.out.println("餐费" + sumprice + "元，送餐费" + delichaege + "元，总计" + (sumprice + delichaege) + "元");
                oSet.names[i] = name;
                oSet.dishMegs[i] = disMeg;
                oSet.times[i] = time;
                oSet.addresses[i] = address;
                oSet.sumPrices[i] = sumprice + delichaege;
                isAdd = false;
                break;
            }
        }
        if (isAdd) {
            System.out.println("对不起！您的餐带已满");
            return false;
        } else {
            return true;
        }
    }

    public void find() {
        System.out.println("序号\t\t订餐人\t\t餐品信息\t\t\t送餐时间\t\t送餐地址\t\t总金额\t订单状况");
        for (int i = 0; i < oSet.names.length; i++) {
            String state = oSet.states[i] == 0 ? "已预定" : "已完成";
            if (oSet.names[i] != null) {
                System.out.println((i + 1) + "\t\t" + oSet.names[i] + "\t\t" + oSet.dishMegs[i] + "\t\t\t"
                        + oSet.times[i] + "\t\t\t"+ oSet.addresses[i] + "\t\t\t" + oSet.sumPrices[i]
                        + "元" + "\t" + state);
            }
        }
    }

    public void qsdd() {//订单签收
        System.out.println("请输入订单号");
        int orderNo = sc.nextInt();
        boolean flag = false;
        for (int i = 0; i < oSet.names.length; i++) {
            if (oSet.names[i] != null && oSet.states[i] == 0 && orderNo == (i + 1)) {
                oSet.states[i] = 1;
                System.out.println("订单已经签收成功");
                flag = true;
            } else if (oSet.names[i] != null && oSet.states[i] == 1 && orderNo == (i + 1)) {
                System.out.println("订单已经是签收状态");
                flag = true;
            }
        }
        if (flag) {
            System.out.println("已签收");
        } else {
            System.out.println("没有此订单号");
        }
    }

    public void deletedd() {//删除订单
        boolean delFlag=false;
        System.out.println("请输入要删除的订单号");
        int deleted=sc.nextInt();
        for(int i=0;i<oSet.names.length;i++){
            if(oSet.names[i]!=null&&oSet.states[i]==1&&deleted==(i+1)){//状态值已完成
                delFlag=true;//可以删除已签收订单
                int index=0;//从后往前 到要删除的位置
                for(int k=deleted-1;k<oSet.names.length;k++){
                    oSet.names[k]=oSet.names[k+1];
                    oSet.addresses[k]=oSet.addresses[k+1];
                    oSet.states[k]=oSet.states[k+1];
                    oSet.times[k]=oSet.times[k+1];
                    oSet.dishMegs[k]=oSet.dishMegs[k+1];
                    oSet.sumPrices[k]=oSet.sumPrices[k+1];
                    index=k;//记录最后一次的位置    有内容的最后位置
                }
                oSet.names[index]=null;
                oSet.addresses[index]=null;
                oSet.dishMegs[index]=null;
                oSet.states[index]=0;
                oSet.times[index]=0;
                oSet.sumPrices[index]=0;
                System.out.println("已删除完毕");
                break;

            }else if(oSet.names[i]!=null&&oSet.states[i]==0&&deleted==(i+1)){//状态值为已预定
                System.out.println("预定的订单不可删除");
                delFlag=true;
            }
        }
        if(delFlag){
            System.out.println("已执行完毕");
        }else{
            System.out.println("没有要删除的定单号");
        }
    }
    public void praise(){//点赞
        System.out.println("序号" + "\t" + "菜名" + "\t" + "单价" );
        for(int i=0;i<disNames.length;i++){
            String price=prices[i]+"元";
            String priseNum=(praiseNums[i]>0)?praiseNums[i]+"赞":"";
            System.out.println((i+1)+"\t"+disNames[i]+"\t"+price+"\t"+priseNum);
        }
        System.out.println("请选择您要点赞的菜名");
        int praiseNum=sc.nextInt();
        praiseNums[praiseNum-1]++;
        System.out.println("点赞成功");

    }
}
