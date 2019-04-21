package com.xujh;

public class Testqiantao {
    public  static  void  main(String []args){
           for (int a=1;a<10;a++){
               System.out.print("\n");
               for (int b=1;b<10;b++){
                    if(a<b)
                        break;
                   System.out.print(b+"x"+a+"="+a*b+" ");

               }
           }
    }

}
