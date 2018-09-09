package com.company.stage9;

public class after2 {
	public static void main(String[] args) {
		int c=0;
		int price=100;
		for(int a=1;a<=20;a++){
			for(int b=0;b<=33;b++){
				c=100-a-b;
				if(5*a+3*b+c/3==100&&c%3==0){
					System.out.println("公鸡"+a+"母鸡"+b+"小鸡"+c);
				}
			}

		}
	}

}

