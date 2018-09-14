package com.company.stage14;

public class XiuGai {
    String[] names = new String[5];

    public boolean editName(String oldName, String newName) {
        boolean find = false;
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals(oldName)) {
                names[i] = newName;
                find = true;
                break;
            }
        }
        return find;
    }

    public void oldName(String oldname) {
        for (int i = 0; i < names.length; i++) {
            if (names[i] == null) {
                names[i] = oldname;
                break;
            }
        }
    }

    public void showoldName() {
        System.out.println("*************************************");
        System.out.println("\t\t客户姓名列表");
        System.out.println("*************************************");
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i] + "\t");

        }
    }

}

