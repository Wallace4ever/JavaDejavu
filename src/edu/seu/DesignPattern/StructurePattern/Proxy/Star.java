package edu.seu.DesignPattern.StructurePattern.Proxy;

public interface Star {
    void signContract();
    void bookTickets();
    void dance();
    void collectMoney();
}

class RealStar implements Star{

    @Override
    public void signContract() {

    }

    @Override
    public void bookTickets() {

    }

    @Override
    public void dance() {
        System.out.println("Wow, I can really dance");
    }

    @Override
    public void collectMoney() {

    }
}

/**
 * 静态代理，开发者自己设计代理类
 */
class Proxy implements Star{
    private RealStar rs=new RealStar();

    @Override
    public void signContract() {
        System.out.println("Signing contract...");
    }

    @Override
    public void bookTickets() {
        System.out.println("Booking tickets...");
    }

    @Override
    public void dance() {
        rs.dance();
    }

    @Override
    public void collectMoney() {
        System.out.println("Collecting money...");
    }
}