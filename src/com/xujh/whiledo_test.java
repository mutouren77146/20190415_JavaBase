package com.xujh;

import java.util.Random;
import java.util.Scanner;

public class whiledo_test {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        /*猜测小于5的随机数*/
        Random random=new Random();
        int randomnum=random.nextInt(5);
        int num=0;
        do {
            System.out.println("请输入一个小于5的整数，回车继续");
            num = sc.nextInt();
            randomnum=random.nextInt(5);
            if (num == randomnum) {
                System.out.println("恭喜你猜对了");
            } else {
                System.out.println("对不起猜错了，随机数是" + randomnum);
            }
        }while (num!=randomnum);
    }
}
