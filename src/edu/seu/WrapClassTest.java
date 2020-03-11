package edu.seu;

public class WrapClassTest {
    public void work(){
        Boolean bln= Boolean.TRUE;
        Byte b= new Byte((byte) 1);//装箱
        Character c='c';//同Integer a=100，自动装箱
        int a=Integer.parseInt("123");
        Integer i= Integer.valueOf("22");
        int d=i.intValue();//拆箱
        int myInt=a+i-3;//自动拆箱
        System.out.println(myInt);

    }
}
