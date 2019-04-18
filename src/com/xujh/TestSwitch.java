package com.xujh;

import java.util.Scanner;
/*开关语句Switch 使用*/
public class TestSwitch {
    public  static  void  main(String []args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        String str="";
        switch (a){
            case  1:
                  str="A 亮了";
                  break;
            case 2:
                 str="B 亮了";
                 break;
                 default:
                     str="没有灯亮";
        }
        System.out.println(str);
    }

}
