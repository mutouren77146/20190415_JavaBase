package com.xujh;
/*数据类型实列*/
public class DataType {
    public  static  void main(String []args){
        byte by=2;//byte 类型的局部变量
        short sh=32767;//short 类型的最大值
        System.out.println("by 的值是"+by);
        System.out.println("sh 的值是"+sh);
        /*获取byte short 类型的存储的最大最小值*/
         System.out.println("byte 的最大值"+Byte.MAX_VALUE);
        System.out.println("byte 的最小值"+Byte.MIN_VALUE);
        System.out.println("short 的最大值"+Short.MAX_VALUE);
        System.out.println("short 的最小值"+Short.MIN_VALUE);
        /*获取整型数值在内存中二进制的存储方式*/
       String str=Integer.toBinaryString(by);
       System.out.println("by 的二进制形式"+str);
    }
}
