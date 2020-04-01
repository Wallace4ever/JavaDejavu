package edu.seu.DesignPattern.StructurePattern.Composite;

/**
 * Leaf叶子节点，如文件
 */
public class File extends  CustomFile{
    private String fileContent;

    public File(String fileName) {
        super(fileName);
    }

    public void printContent(){
        System.out.println(fileContent);
    }
}
