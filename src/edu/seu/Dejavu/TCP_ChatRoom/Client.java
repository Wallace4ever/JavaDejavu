package edu.seu.Dejavu.TCP_ChatRoom;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket client=new Socket("localhost",8888);
        new Thread(new Send(client)).start();
        new Thread(new Receive(client)).start();
    }
}

class Send implements Runnable {
    private BufferedReader br;
    private DataOutputStream dos;
    private boolean isRunning=true;

    public Send() {
        br=new BufferedReader(new InputStreamReader(System.in));
    }
    public Send(Socket client) {
        this();
        try {
            dos=new DataOutputStream(client.getOutputStream());
        } catch (IOException e) {
            e.printStackTrace();
            isRunning=false;
            CloseUtil.closeAll(dos,br);
        }
    }

    private String getMsgFromConsole() {
        try {
            return br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
    private void send(){
        String msg=getMsgFromConsole();
        if (msg!=null&&!msg.equals("")){
            try {
                dos.writeUTF(msg);
                dos.flush();
            } catch (IOException e) {
                e.printStackTrace();
                isRunning=false;
                CloseUtil.closeAll(dos,br);
            }
        }
    }
    @Override
    public void run() {
        while (isRunning){
            send();
        }
    }
}

class Receive implements Runnable {
    private DataInputStream dis;
    private boolean isRunning=true;
    public  Receive(Socket client){
        try {
            dis=new DataInputStream(client.getInputStream());
        } catch (IOException e) {
            e.printStackTrace();
            isRunning=false;
            CloseUtil.closeAll(dis);
        }
    }
    @Override
    public void run() {
        while (isRunning) {
            try {
                String msg=dis.readUTF();
                System.out.println(msg);
            } catch (IOException e) {
                e.printStackTrace();
                isRunning=false;
                CloseUtil.closeAll(dis);
            }
        }
    }
}

class CloseUtil{
    public static void closeAll(Closeable... io) {
        for (Closeable i:io){
            if (null!=i){
                try {
                    i.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}