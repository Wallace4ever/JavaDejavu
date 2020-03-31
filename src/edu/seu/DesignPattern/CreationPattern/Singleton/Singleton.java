package edu.seu.DesignPattern.CreationPattern.Singleton;

/**
 * 内部类方式实现单例模式
 */
public class Singleton {
    private String name;
    private Singleton(){
        name="The only Singleton with inner class";
    }
    private static class SingletonHolder{
        private static Singleton instance=new Singleton();
    }
    public static Singleton getInstance(){
        return SingletonHolder.instance;
    }
    public void printName(){
        System.out.println(name);
    }
}

/**
 * 枚举方式实现单例模式
 */
enum EnumSingleton{
    instance;
    private EnumSingleton(){}
    public void printName(){
        System.out.println("The only EnumSingleton");
    }
}

/**
 * 饿汉式方法实现单例模式，不同于前面两者的懒汉方式（实现了懒加载）
 * 会在类被加载时就创建实例
 */
class HungryLoader{
    private String name;
    private static HungryLoader h= new HungryLoader();
    private HungryLoader(){
        name="The only HungryLoader";
    }
    public static HungryLoader getInstance(){
        return h;
    }
    public void printName(){
        System.out.println(name);
    }
}