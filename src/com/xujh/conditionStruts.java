package com.xujh;

import java.util.Scanner;
/**学习java中的if else 判断语句**/
public class conditionStruts {
      static  final  int AGE_MAX=18;
     public  static  void  main(String[] args){
         /*实现从控制台接收用户输入的年龄，如果大于18则输出你的年龄*/
         Scanner in=new Scanner(System.in);
         System.out.println("请输入你得年龄回车继续");
         int age=in.nextInt();//接收用户输入的年龄
         if(age>=AGE_MAX){
             System.out.println("恭喜你成年了，年龄是："+age);
         }
         else{
             System.out.println("抱歉你还未成年不能玩游戏");
         }
     }
}
