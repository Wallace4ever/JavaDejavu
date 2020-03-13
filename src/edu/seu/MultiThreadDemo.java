package edu.seu;

public class MultiThreadDemo {
    public static void work(){
        One one=new One();
        int digit=100;
        Two s1=new Two(one,digit++);
        Two s2=new Two(one,digit++);
        Two s3=new Two(one,digit++);
        try{
            s1.t.join();
            s2.t.join();
            s3.t.join();
        }catch (InterruptedException e){
            System.out.println("Interrupted!");
        }
    }
}

class One{
    synchronized void display(int num){
        System.out.println("One"+num);
        try{
            Thread.sleep(2000);
        }catch(InterruptedException e){
            System.out.println("Thread interrupted!");
        }
        System.out.println("Thread "+Thread.currentThread().getName()+" Finished");
    }
}

class Two implements Runnable{
    int number;
    One one;
    Thread t;
    public Two(One oneNum, int n){
        one=oneNum;
        number=n;
        t=new Thread(this);
        t.start();
    }
    @Override
    public void run(){
        one.display(number);
    }
}
