package edu.seu.DesignPattern.StructurePattern.Composite;
import java.util.ArrayList;

/**
 * Composite 容器 如文件夹
 */
public class Folder extends CustomFile {
    private ArrayList<CustomFile> contents= new ArrayList<>();

    public Folder(String CustomFileName) {
        super(CustomFileName);
    }

    public void addCustomFile(CustomFile f){
        contents.add(f);
    }

    public void removeCustomFile(CustomFile f){
        contents.remove(f);
    }

    public CustomFile getCustomFile(String name){
        for (CustomFile f:contents){
            if(f.fileName.equals(name)){
                return f;
            }
        }
        return null;
    }

    public void printAllFiles(){
        for (CustomFile f:contents){
            System.out.println(f.fileName);
        }
    }
}
