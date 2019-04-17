package com.xujh;
/**
 * 学习java第一个程序
 * */
public class HelloWord {
  public  static  void  main(String []args){
    int sum1= Add(1,2);
    int sum2= Add(3,4);
    System.out.println(sum1);
    System.out.println(sum2);
    System.out.println("Add Successfully");
  }
  public static   int Add(int a,int b ){
      int c=a+b;
      return  c;
  }

}
