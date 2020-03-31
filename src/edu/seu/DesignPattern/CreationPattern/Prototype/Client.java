package edu.seu.DesignPattern.CreationPattern.Prototype;

import java.util.Date;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        //浅克隆测试
        ShallowSheep ss=new ShallowSheep("少利",new Date(123456789L));
        System.out.println(ss+" "+ss.getName()+" "+ss.getBirthday());
        ShallowSheep clonedSS=(ShallowSheep) ss.clone();
        clonedSS.setName("多利");

        System.out.println(clonedSS+" "+clonedSS.getName()+" "+clonedSS.getBirthday());
        ss.setBirthday(new Date(987654321L));
        System.out.println("After change:");
        System.out.println(ss+" "+ss.getName()+" "+ss.getBirthday());
        System.out.println(clonedSS+" "+clonedSS.getName()+" "+clonedSS.getBirthday());
        System.out.println();

        //深克隆测试
        DeepSheep ds=new DeepSheep("少利",new Date(123456789L));
        System.out.println(ds+" "+ds.getName()+" "+ds.getBirthday());
        DeepSheep clonedDS=(DeepSheep)ds.clone();
        clonedDS.setName("多利");
        System.out.println(clonedDS+" "+clonedDS.getName()+" "+clonedDS.getBirthday());
        ds.setBirthday(new Date(987654321L));
        System.out.println("After change:");
        System.out.println(ds+" "+ds.getName()+" "+ds.getBirthday());
        System.out.println(clonedDS+" "+clonedDS.getName()+" "+clonedDS.getBirthday());
    }
}
