package com.company.stage14;

public class TestPractice3 {
    public static void main(String[] args) {
        Practice3 cs = new Practice3();
        String[] names = new String[]{"Tom", "Jack", "Merry", "Smith", "Sunny"};
        System.out.println("排序前");
        for (int i = 0; i < names.length; i++) {
            if (names[i] != null) {
                System.out.print(names[i] + "\t");
            }
        }
        cs.sortNames(names);
        System.out.println("\n排序后");
        for (int i = 0; i < names.length; i++) {
            if (names[i] != null) {
                System.out.print(names[i] + "\t");
            }
        }
    }
}

