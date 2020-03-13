package edu.seu;
import java.io.*;
import java.util.*;

/**
 * @author wallace
 */
public class TextReaderDemo {
    public void work(){
        try{
            File target=new File("/Users/wallace/IdeaProjects/JavaDejavu/out/production/JavaDejavu/edu/seu/sample.txt");
            FileInputStream fin=new FileInputStream(target);
            System.out.println("File Content:\n");
            int ch=fin.read();
            while(ch!=-1){
                System.out.print((char)ch);
                ch=fin.read();
            }
            fin.close();
            System.out.println();
            DirInfo.checkDir(target);
        }
        catch(FileNotFoundException e){
            System.out.println("File not found!");
        }
        catch (IOException e){
            System.out.println("InputStream error!");
        }
    }
}

class DirInfo{
    public static void checkDir(File f) {
        StringBuilder absPath=new StringBuilder(f.getAbsolutePath());
        absPath.delete(absPath.lastIndexOf("/"),absPath.length());
        String[] dirlist=new File(absPath.toString()).list();
        File currentFile=null;
        if (dirlist == null) {
            throw new AssertionError();
        }
        for (String fileName:dirlist){
            currentFile=new File(absPath.toString()+"/"+fileName);
            Date fileDate=new Date(currentFile.lastModified());
            if (currentFile.isFile()){
                System.out.println(""+fileDate+"\t"+currentFile.length()+"\t"+fileName);
            }else{
                System.out.println(""+fileDate+"\t"+"<DIR>"+"\t"+fileName);
            }
        }
        System.out.println(absPath.toString());
    }
}