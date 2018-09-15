package com.company.stage14;

public class Practice2 {
    String[] names = new String[5];

    public void addName(String name) {
        for (int i = 0; i < names.length; i++) {
            if (names[i] == null) {
                names[i] = name;
                break;
            }
        }
    }

    public void showNames() {
        System.out.println("************************************");
        System.out.println("\t\t客户姓名列表：");
        System.out.println("************************************");
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i] + "\t");
        }
    }

    public boolean editName(String oldName, String newName) {
        boolean find = false;
        /*是否找到并修改成功标识
        循环数组，找到姓名为oldName的元素，修改newName*/
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals(oldName)) {
                names[i] = newName;
                find = true;
                break;
            }
        }
        return find;
    }

}

