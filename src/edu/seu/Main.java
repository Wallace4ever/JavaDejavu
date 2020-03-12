package edu.seu;

public class Main {

    public static void main(String[] args) {
        String[]names={"java.home","java.version","os.arch","os.name","os.version","user.dir","user.home","user.name"};
        for (String name : names) {
            System.out.println(name + ": " + System.getProperty(name));
        }
//        StringBufferTest sbt=new StringBufferTest();
//        sbt.work();
//        ScannerTest st=new ScannerTest();
//        st.work();
//        WrapClassTest wct=new WrapClassTest();
//        wct.work();
//        EnumTest et=new EnumTest();
//        et.work();
//        ArrayTest at=new ArrayTest();
//        System.out.println("3.0/0.0="+3.0/0.0);
        OverrideDemo.work();
    }
}
