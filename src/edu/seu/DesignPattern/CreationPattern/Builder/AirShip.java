package edu.seu.DesignPattern.CreationPattern.Builder;

public class AirShip {
    private Engine e;
    private EscapeTower et;

    public AirShip(Engine e, EscapeTower et) {
        this.e = e;
        this.et = et;
    }

    public Engine getE() {
        return e;
    }

    public void setE(Engine e) {
        this.e = e;
    }

    public EscapeTower getEt() {
        return et;
    }

    public void setEt(EscapeTower et) {
        this.et = et;
    }
}

class Engine{
    private String name;

    Engine(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

class EscapeTower{
    private String name;

    EscapeTower(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
