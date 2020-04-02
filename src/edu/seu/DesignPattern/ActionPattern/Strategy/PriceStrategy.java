package edu.seu.DesignPattern.ActionPattern.Strategy;

public interface PriceStrategy {
    double returnPrice(double originalPrice);
}

class AggressiveStrategy implements PriceStrategy{

    @Override
    public double returnPrice(double originalPrice) {
        return originalPrice*0.7;
    }
}

class ConventionalStrategy implements PriceStrategy{

    @Override
    public double returnPrice(double originalPrice) {
        return originalPrice*0.95;
    }
}