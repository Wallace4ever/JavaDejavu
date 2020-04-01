package edu.seu.DesignPattern.StructurePattern.Composite;

/**
 * 抽象构件 Component 定义叶子和容器构件的共同点
 */
public interface Component {
    public void method();
}

abstract class CustomFile implements Component{
    protected String fileName;

    public CustomFile(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void method() {
        System.out.println(fileName);
    }
}
