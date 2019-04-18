package com.xujh;

public class while_test {
     public static void main(String []args){
         int sum1=0;
         int sum2=0;
         int num=1;
         while(num<=100){
             if(num%2==0){
                sum2+=num;
             }
             else{
                 sum1+=num;
             }
             num++;
         }
         if(sum1>sum2){
             System.out.println("奇数的累加和大");
             System.out.println(sum1);

         }
         else{
             System.out.println("偶数的累加和大");
             System.out.println(sum2);

         }
     }
}
