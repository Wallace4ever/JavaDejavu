package edu.seu.DesignPattern.CreationPattern.Builder;

/**
 * 客户端只需要使用Director和Builder即可获得一个由Engine和EscapeTower组成的更复杂对象AirShip
 */
public class Client {
    public static void main(String[] args) {
        AirShipDirector director=new MyAirShipDirector(new MyAirShipBuilder());
        AirShip ship=director.directAirShip();
        System.out.println(ship.getE().getName());
        System.out.println(ship.getEt().getName());
    }
}
