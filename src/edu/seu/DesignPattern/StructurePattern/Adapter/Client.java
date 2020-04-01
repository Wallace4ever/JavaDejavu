package edu.seu.DesignPattern.StructurePattern.Adapter;

/**
 * 客户端通过已有的目标接口（如USB）和适配器（如USB转PS2）即可连接PS2键盘
 * 如果适配器采用继承PS2键盘的方式来构造则测试方法中不必新实例化一个PS2键盘对象，相当于适配器向客户端隐藏了PS2键盘的存在
 */
public class Client {
    public static void main(String[] args) {
        PS2KeyBoard ps2KBD=new PS2KeyBoard();
        USBDevice usbKBD=new Adapter(ps2KBD);
        usbKBD.signalByUSB("Some words.");
    }
}
