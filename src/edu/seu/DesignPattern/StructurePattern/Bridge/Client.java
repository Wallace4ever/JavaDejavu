package edu.seu.DesignPattern.StructurePattern.Bridge;

/**
 * 通过桥接模式避免为二维乃至于高维空间中的每一个点（通过多层继承的方式）都设计一个类
 * 桥连接了多个维度,新增维度时可以组合多个桥（对各维度的引用）
 * 当某一维度增加一个新的种类时，在该维度（例如品牌）中增加新的实现类即可，无需为每种设备都增加该品牌的型号（型号就是多维空间中具体的点）
 * 与装饰模式相比，两者都是为了避免类膨胀的问题。装饰模式中具体构件是稳定的，但桥接模式中的具体构件本身就不稳定，会沿着各维度变化。
 */
public class Client {
    public static void main(String[] args) {
        //比如要增加一台Dell的台式机来售卖
        Device dellDesktop=new Desktop(new Dell());
        dellDesktop.sell();
        //增加一台Dell的笔记本
        Device dellLaptop=new Laptop(new Dell());
        dellLaptop.sell();
        //增加一台联想的平板来售卖
        Device lenovoTablet=new Tablet(new Lenovo());
        lenovoTablet.sell();
    }
}
