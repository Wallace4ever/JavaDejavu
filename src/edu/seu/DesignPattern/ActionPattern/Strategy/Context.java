package edu.seu.DesignPattern.ActionPattern.Strategy;

public class Context {
    private PriceStrategy ps;

    public Context(PriceStrategy ps) {
        this.ps = ps;
    }

    public void printPrice(double originalPrice){
        System.out.println(ps.returnPrice(originalPrice));
    }
}
