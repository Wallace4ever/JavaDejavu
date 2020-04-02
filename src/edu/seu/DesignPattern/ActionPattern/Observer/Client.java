package edu.seu.DesignPattern.ActionPattern.Observer;

public class Client {
    public static void main(String[] args) {
        Subject s=new SubjectA();
        Observer a1=new ObserverA();
        Observer a2=new ObserverA();
        s.register(a1);
        s.register(a2);
        s.setState(10);
        System.out.println(a1.getLocalState());
        System.out.println(a2.getLocalState());
        s.setState(20);
        System.out.println(a1.getLocalState());
        System.out.println(a2.getLocalState());
    }
}
