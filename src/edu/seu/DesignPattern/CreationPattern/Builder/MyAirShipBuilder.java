package edu.seu.DesignPattern.CreationPattern.Builder;

public class MyAirShipBuilder implements AirShipBuilder {
    @Override
    public Engine buildEngine() {
        return new Engine("神州牌引擎");
    }

    @Override
    public EscapeTower buildEscapeTower() {
        return new EscapeTower("神州牌逃逸塔");
    }
}
