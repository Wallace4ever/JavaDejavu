package edu.seu.DesignPattern.StructurePattern.Composite;

/**
 * 组合模式，为处理树形结构（如目录树）提供了解决方案
 */
public class Client {
    public static void main(String[] args) {
        File f1=new File("1.txt");
        File f2=new File("2.txt");
        File f3=new File("3.txt");
        Folder fd1=new Folder("folder1");
        Folder fd2=new Folder("folder2");
        fd1.addCustomFile(f1);
        fd1.addCustomFile(f2);
        fd1.addCustomFile(fd2);
        fd2.addCustomFile(f3);
        fd1.printAllFiles();//使用在抽象构件角色CustomFile中定义的 文件和文件夹都有的打印名称功能
    }
}
