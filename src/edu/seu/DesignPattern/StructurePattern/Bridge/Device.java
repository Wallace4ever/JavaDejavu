package edu.seu.DesignPattern.StructurePattern.Bridge;

/**
 * 这里对品牌的引用就是"桥"
 */
public abstract class Device {
    private Brand b;

    protected Device(Brand b) {
        this.b = b;
    }

    public void sell(){
        b.sell();
    }
}

class Desktop extends Device{

    protected Desktop(Brand b) {
        super(b);
    }

    @Override
    public void sell() {
        super.sell();
        System.out.println("Desktop");
    }
}

class Laptop extends Device{

    protected Laptop(Brand b) {
        super(b);
    }

    @Override
    public void sell() {
        super.sell();
        System.out.println("Laptop");
    }
}

class Tablet extends Device{

    protected Tablet(Brand b) {
        super(b);
    }

    @Override
    public void sell() {
        super.sell();
        System.out.println("Tablet");
    }
}