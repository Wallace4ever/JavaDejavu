package edu.seu.DesignPattern.StructurePattern.Adapter;

/**
 * Adaptee to be adapted.
 */
public interface PS2Device{
    public void signalByPS2(String signal);
}

class PS2KeyBoard implements PS2Device{

    @Override
    public void signalByPS2(String signal) {
        System.out.println("This is PS2 keyboard typing:"+signal);
    }
}
