package edu.seu.Dejavu;
import java.util.Scanner;

public class ScannerDemo {
    public void work(){
        double d;
        Scanner keyin=new Scanner(System.in);
        System.out.println("输入一个实数：\n");
        d =keyin.nextDouble();
        System.out.println("你输入的实数d是："+d);
    }
}
