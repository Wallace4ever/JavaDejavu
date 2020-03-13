package edu.seu;

public class StringBufferDemo {
    String str1;
    public void work(){
        str1="从来富贵都是梦";
        str1=str1+"未有圣贤不读书";
        System.out.println(str1);
        StringBuffer sb1=new StringBuffer("静思生智慧，");
        StringBuffer sb2=sb1.append("慧可接怨！");
        sb2.insert(6,"识别转置，");
        System.out.println("sb1:"+sb1);
        System.out.println("sb2:"+sb2);
        sb1.append(Math.E);
        System.out.println("sb1 Append E:"+sb1);
        System.out.println(sb1.charAt(2));
        System.out.println(sb1.length());
        System.out.println(sb1.capacity());
    }
}
