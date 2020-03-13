package edu.seu;

/**
 * @author wallace
 */
public class Main {

    public static void main(String[] args){
        String[]names={"\njava.version","os.arch","os.name","os.version","user.dir","user.home","user.name"};
        for (String name : names) {
            System.out.println(name + ": " + System.getProperty(name));
        }
        System.out.println();
//        StringBufferDemo sbt=new StringBufferDemo();
//        sbt.work();
//        ScannerDemo st=new ScannerDemo();
//        st.work();
//        WrapClassDemo wct=new WrapClassDemo();
//        wct.work();
//        EnumDemo et=new EnumDemo();
//        et.work();
//        ArrayDemo at=new ArrayDemo();
//        System.out.println("3.0/0.0="+3.0/0.0);
//        OverrideDemo.work();
//        UserExceptionDemo ued=new UserExceptionDemo();
//        String[] s={"Aha!","Blah"};
//        ued.work(s);
//        TextReaderDemo trd=new TextReaderDemo();
//        trd.work();
//        MultiThreadDemo.work();
        MiniCurl.work("www.baidu.com");
    }
}
