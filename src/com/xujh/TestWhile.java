package com.xujh;

public class TestWhile {
    public  static  void main(String []args){
        /*利用while 循环语法完成100以内的所有正整数累加计算*/
        int sum=0;
         int num=1;
         while (num<=100){
             sum+=num;
             num++;
         }
         System.out.println(sum);
         /*打印10*10 的正方形*/
        int index=1;
        while(index<=100){
            System.out.print("*");
            if (index%10==0){
                System.out.print("\n");
            }
            index++;
        }
    }
}
