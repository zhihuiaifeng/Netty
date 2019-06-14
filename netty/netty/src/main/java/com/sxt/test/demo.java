package com.sxt.test;

/**
 * @Auther: Administrator
 * @Date: 2019/6/3 0003 14:28
 * @Description:
 */

public class demo {
    public static void main(String[] args) {
        int getvalue = getvalue(2);
        System.out.println(getvalue);
        String a="hello";
        link(a);
        System.out.println(a);
        String s = new String("3");
        String s1 = new String("3");
        //因为比较的是常量池中的内容所以相等
         System.out.println(s.intern()==s1.intern());
        StringBuilder aa = new StringBuilder("aa");
        StringBuilder bb = new StringBuilder("bb");
        compare(aa,bb);
        System.out.println(aa+"+"+bb);


    }
    public static void compare(StringBuilder a,StringBuilder b){
        a.append(b);
        b=a;

    }
    public static int getvalue(int i){
         int snum =0;
         switch (i){
             case 1:
                 snum=snum+i;
             case 2:
                 snum=snum+i*2;


         }
         return snum;

    }
    public static void link(String a){
        a+="world";
    }
}
class threadde implements Runnable{

    static int num222=0;

    public void run() {
        for (int i = 0; i < 50; i++) {
            num222=num222+1;

        }

    }

    public static void main(String[] args) {
        for (int i = 0; i < 2; i++) {
            new Thread(new threadde()).start();

        }
        System.out.println(num222);
        String temp="";
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            stringBuilder.append(i);
        }
            temp=stringBuilder.toString();
        int length = temp.length();
        System.out.println(temp);
    }
}
