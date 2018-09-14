package com.company.stage14;

public class Custrom {
        String []names=new String[4];
        public void CustromName(String name){
            for(int i=0;i<names.length;i++){
                if(names[i]==null){
                    names[i]=name;
                    break;
                }
            }
        }
        public void showName(){
            for(int i=0;i<names.length;i++){
                System.out.print(names[i]+"\t");
            }
        }
    }

