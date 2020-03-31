package edu.seu.DesignPattern.CreationPattern.Builder;

public class MyAirShipDirector implements AirShipDirector {
    private AirShipBuilder builder;

    public MyAirShipDirector(AirShipBuilder builder) {
        this.builder = builder;
    }

    @Override
    public AirShip directAirShip() {
        Engine e=builder.buildEngine();
        EscapeTower et=builder.buildEscapeTower();

        AirShip ship=new AirShip(e,et);
        return ship;
    }
}
