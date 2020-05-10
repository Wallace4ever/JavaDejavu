package edu.seu.Dejavu.TCP_ChatRoom;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Server {
    private List<OneChannel> all=new ArrayList<>();
    public static void main(String[] args) throws IOException {
        new Server().start();
    }
    public void start() throws IOException {
        ServerSocket server =new ServerSocket(8888);
        while (true) {
            Socket client=server.accept();
            OneChannel channel=new OneChannel(client);
            all.add(channel);
            new Thread(channel).start();
        }
    }

    private class OneChannel implements Runnable {
        private DataInputStream dis;
        private DataOutputStream dos;
        private boolean isRunning=true;
        public OneChannel(Socket server){
            try {
                dis=new DataInputStream(server.getInputStream());
                dos=new DataOutputStream(server.getOutputStream());
            } catch (IOException e) {
                e.printStackTrace();
                isRunning=false;
                CloseUtil.closeAll(dis,dos);
                all.remove(this);
            }
        }
        private String receive() {
            try {
                return dis.readUTF();
            } catch (IOException e) {
                e.printStackTrace();
                isRunning=false;
                CloseUtil.closeAll(dis,dos);
                all.remove(this);
            }
            return null;
        }

        private void send(String msg) {
            if (msg==null||msg.equals("")) {
                return;
            }
            try {
                dos.writeUTF(msg);
            } catch (IOException e) {
                e.printStackTrace();
                isRunning=false;
                CloseUtil.closeAll(dis,dos);
                all.remove(this);
            }
        }
        private void sendToOthers(String msg) {
            if (msg==null||msg.equals("")) {
                return;
            }
            for (OneChannel channel:all){
                if (channel==this){
                    continue;
                }
                channel.send(msg);
            }
        }
        @Override
        public void run() {
            while (isRunning) {
                String msg=receive();
                send("你的消息是："+msg);
                sendToOthers(msg);
            }
        }
    }
}
