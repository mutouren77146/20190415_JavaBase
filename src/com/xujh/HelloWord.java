package com.xujh;
public class HelloWord {
  public  static  void  main(String []args){
    int sum1= Add(1,2);
    int sum2= Add(3,4);
    System.out.println(sum1);
    System.out.println(sum2);
  }
  public static   int Add(int a,int b ){
      int c=a+b;
      return  c;

  }

}
