package edu.seu.Dejavu;

class SuperClass {
    int a;
    SuperClass(){a=10;}
    public void printA(){System.out.println("父类中a="+a);}
}

class SubClass extends SuperClass{
    int a;
    SubClass(int a){this.a=a;}
    @Override
    public void printA(){
        System.out.println("父类中a="+super.a);
        System.out.println("子类中a="+a);
    }
}

public class OverrideDemo{
    public static void work(){
        SuperClass s1= new SubClass(20);
        s1.printA();
    }
}