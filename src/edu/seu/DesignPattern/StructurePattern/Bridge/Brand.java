package edu.seu.DesignPattern.StructurePattern.Bridge;

public interface Brand {
    public void sell();
}

class Dell implements Brand{

    @Override
    public void sell() {
        System.out.print("Selling Dell's ");
    }
}

class Lenovo implements Brand{

    @Override
    public void sell() {
        System.out.print("Selling Lenovo's ");
    }
}
