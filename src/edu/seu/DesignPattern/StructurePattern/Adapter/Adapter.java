package edu.seu.DesignPattern.StructurePattern.Adapter;

/**
 * 组合方式构造Adapter
 */
public class Adapter implements USBDevice {
    PS2KeyBoard psk;

    public Adapter(PS2KeyBoard psk) {
        this.psk = psk;
    }

    @Override
    public void signalByUSB(String signal) {
        psk.signalByPS2(signal);
    }
}

/**
 * 继承方式构造Adapter，仅当Adapter不需要继承其他类时使用
 */
/*public class Adapter extends PS2KeyBoard implements USBDevice {
    @Override
    public void signalByUSB(String signal) {
        super.signalByPS2(signal);
    }
}*/
