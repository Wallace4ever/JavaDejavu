package edu.seu.DesignPattern.StructurePattern.Proxy;

public class Client {
    public static void main(String[] args) {
        Star s=new Proxy();
        s.signContract();
        s.bookTickets();
        s.dance();
        s.collectMoney();
    }
}
